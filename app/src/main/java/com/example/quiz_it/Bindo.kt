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
    private var mQuestionsList: ArrayList<QuestionsF>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityBindoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityBindoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = Constants.getQuestions()

        setQuestion()

        binding.tvOptionOneb.setOnClickListener(this)
        binding.tvOptionTwob.setOnClickListener(this)
        binding.tvOptionThreeb.setOnClickListener(this)
        binding.tvOptionFourb.setOnClickListener(this)
        binding.btnSubmitb.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmitb.text = "FINISH"
        }else{
            binding.btnSubmitb.text = "SUBMIT"
        }

        binding.progressBarb.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition" + "/" + binding.progressBarb.max

        binding.tvQuestionb.text= question!!.question
        binding.tvOptionOneb.text = question.optionOne
        binding.tvOptionTwob.text = question.optionTwo
        binding.tvOptionThreeb.text = question.optionThree
        binding.tvOptionFourb.text = question.optionFour
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOneb)
        options.add( 1, binding.tvOptionTwob)
        options.add( 2, binding.tvOptionThreeb)
        options.add( 3, binding.tvOptionFourb)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOneb.id ->{
                SelectedOptionView(binding.tvOptionOneb, 1)
            }
            binding.tvOptionTwob.id ->{
                SelectedOptionView(binding.tvOptionTwob, 2)
            }
            binding.tvOptionThreeb.id ->{
                SelectedOptionView(binding.tvOptionThreeb, 3)
            }
            binding.tvOptionFourb.id ->{
                SelectedOptionView(binding.tvOptionFourb, 4)
            }
            binding.btnSubmitb.id ->{

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
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnswer, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmitb.text = "FINISH"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOneb.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwob.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreeb.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFourb.background = ContextCompat.getDrawable(this,drawableView)
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