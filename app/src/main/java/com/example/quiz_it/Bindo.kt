package com.example.quiz_it

import android.R
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.quiz_it.databinding.ActivityBindoBinding


class  Bindo: AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionB>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityBindoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityBindoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = ConstanB.getQuestions()

        setQuestion()

        binding.tvOptionOnebi.setOnClickListener(this)
        binding.tvOptionTwobi.setOnClickListener(this)
        binding.tvOptionThreebi.setOnClickListener(this)
        binding.tvOptionFourbi.setOnClickListener(this)
        binding.btnSubmitbi.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmitbi.text = "FINISH"
        }else{
            binding.btnSubmitbi.text = "SUBMIT"
        }

        binding.progressBarbi.progress = mCurrentPosition
        binding.tvProgressbi.text = "$mCurrentPosition" + "/" + binding.progressBarbi.max

        binding.tvQuestionbi.text= question!!.questionb
        binding.tvOptionOnebi.text = question.optionOneb
        binding.tvOptionTwobi.text = question.optionTwob
        binding.tvOptionThreebi.text = question.optionThreeb
        binding.tvOptionFourbi.text = question.optionFourb
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOnebi)
        options.add( 1, binding.tvOptionTwobi)
        options.add( 2, binding.tvOptionThreebi)
        options.add( 3, binding.tvOptionFourbi)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOnebi.id ->{
                SelectedOptionView(binding.tvOptionOnebi, 1)
            }
            binding.tvOptionTwobi.id ->{
                SelectedOptionView(binding.tvOptionTwobi, 2)
            }
            binding.tvOptionThreebi.id ->{
                SelectedOptionView(binding.tvOptionThreebi, 3)
            }
            binding.tvOptionFourbi.id ->{
                SelectedOptionView(binding.tvOptionFourbi, 4)
            }
            binding.btnSubmitbi.id ->{

                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else->{
                        val intent = Intent(this, ResultFlag::class.java)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionsList!!.size)
                        startActivity(intent)
                    }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if(question!!.correctAnswerb != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnswerb, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmitbi.text = "FINISH"
                    }else{
                        binding.btnSubmitbi.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOnebi.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwobi.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreebi.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFourbi.background = ContextCompat.getDrawable(this,drawableView)
            }
        }
    }

    private fun SelectedOptionView(tv: TextView,SelectedOptionNumber: Int){

        deafultOptionsView()
        mSelectedOptionPosition = SelectedOptionNumber
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.selected_option_border_bg)
    }
}