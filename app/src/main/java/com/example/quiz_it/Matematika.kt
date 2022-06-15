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
import com.example.quiz_it.databinding.ActivityMatematikaBinding


class  Matematika: AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionM>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityMatematikaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityMatematikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = ConstanM.getQuestions()

        setQuestion()

        binding.tvOptionOnem.setOnClickListener(this)
        binding.tvOptionTwom.setOnClickListener(this)
        binding.tvOptionThreem.setOnClickListener(this)
        binding.tvOptionFourm.setOnClickListener(this)
        binding.btnSubmitm.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmitm.text = "FINISH"
        }else{
            binding.btnSubmitm.text = "SUBMIT"
        }

        binding.progressBarm.progress = mCurrentPosition
        binding.tvProgressm.text = "$mCurrentPosition" + "/" + binding.progressBarm.max

        binding.tvQuestionm.text= question!!.questionm
        binding.tvOptionOnem.text = question.optionOnem
        binding.tvOptionTwom.text = question.optionTwom
        binding.tvOptionThreem.text = question.optionThreem
        binding.tvOptionFourm.text = question.optionFourm
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOnem)
        options.add( 1, binding.tvOptionTwom)
        options.add( 2, binding.tvOptionThreem)
        options.add( 3, binding.tvOptionFourm)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOnem.id ->{
                SelectedOptionView(binding.tvOptionOnem, 1)
            }
            binding.tvOptionTwom.id ->{
                SelectedOptionView(binding.tvOptionTwom, 2)
            }
            binding.tvOptionThreem.id ->{
                SelectedOptionView(binding.tvOptionThreem, 3)
            }
            binding.tvOptionFourm.id ->{
                SelectedOptionView(binding.tvOptionFourm, 4)
            }
            binding.btnSubmitm.id ->{

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
                    if(question!!.correctAnswerm != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnswerm, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmitm.text = "FINISH"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOnem.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwom.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreem.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFourm.background = ContextCompat.getDrawable(this,drawableView)
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