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
import com.example.quiz_it.databinding.ActivityIpaBinding


class  Ipa: AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionI>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityIpaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityIpaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = ConstansI.getQuestions()

        setQuestion()

        binding.tvOptionOnei.setOnClickListener(this)
        binding.tvOptionTwoi.setOnClickListener(this)
        binding.tvOptionThreei.setOnClickListener(this)
        binding.tvOptionFouri.setOnClickListener(this)
        binding.btnSubmiti.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmiti.text = "FINISH"
        }else{
            binding.btnSubmiti.text = "SUBMIT"
        }

        binding.progressBari.progress = mCurrentPosition
        binding.tvProgressi.text = "$mCurrentPosition" + "/" + binding.progressBari.max

        binding.tvQuestioni.text= question!!.questioni
        binding.tvOptionOnei.text = question.optionOnei
        binding.tvOptionTwoi.text = question.optionTwoi
        binding.tvOptionThreei.text = question.optionThreei
        binding.tvOptionFouri.text = question.optionFouri
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOnei)
        options.add( 1, binding.tvOptionTwoi)
        options.add( 2, binding.tvOptionThreei)
        options.add( 3, binding.tvOptionFouri)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOnei.id ->{
                SelectedOptionView(binding.tvOptionOnei, 1)
            }
            binding.tvOptionTwoi.id ->{
                SelectedOptionView(binding.tvOptionTwoi, 2)
            }
            binding.tvOptionThreei.id ->{
                SelectedOptionView(binding.tvOptionThreei, 3)
            }
            binding.tvOptionFouri.id ->{
                SelectedOptionView(binding.tvOptionFouri, 4)
            }
            binding.btnSubmiti.id ->{

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
                    if(question!!.correctAnsweri != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnsweri, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmiti.text = "FINISH"
                    }else{
                    binding.btnSubmiti.text = "GO TO NEXT QUESTION"
                }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOnei.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwoi.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreei.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFouri.background = ContextCompat.getDrawable(this,drawableView)
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