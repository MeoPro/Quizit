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
import com.example.quiz_it.databinding.ActivityBinatangBinding


class  Binatang: AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionN>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityBinatangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityBinatangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = ConstanN.getQuestions()

        setQuestion()

        binding.tvOptionOnen.setOnClickListener(this)
        binding.tvOptionTwon.setOnClickListener(this)
        binding.tvOptionThreen.setOnClickListener(this)
        binding.tvOptionFourn.setOnClickListener(this)
        binding.btnSubmitn.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmitn.text = "FINISH"
        }else{
            binding.btnSubmitn.text = "SUBMIT"
        }

        binding.progressBarn.progress = mCurrentPosition
        binding.tvProgressn.text = "$mCurrentPosition" + "/" + binding.progressBarn.max

        binding.tvQuestionn.text= question!!.questionn
        binding.tvOptionOnen.text = question.optionOnen
        binding.tvOptionTwon.text = question.optionTwon
        binding.tvOptionThreen.text = question.optionThreen
        binding.tvOptionFourn.text = question.optionFourn
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOnen)
        options.add( 1, binding.tvOptionTwon)
        options.add( 2, binding.tvOptionThreen)
        options.add( 3, binding.tvOptionFourn)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOnen.id ->{
                SelectedOptionView(binding.tvOptionOnen, 1)
            }
            binding.tvOptionTwon.id ->{
                SelectedOptionView(binding.tvOptionTwon, 2)
            }
            binding.tvOptionThreen.id ->{
                SelectedOptionView(binding.tvOptionThreen, 3)
            }
            binding.tvOptionFourn.id ->{
                SelectedOptionView(binding.tvOptionFourn, 4)
            }
            binding.btnSubmitn.id ->{

                if (mSelectedOptionPosition == 0){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else->{
                        val intent = Intent(this, ResultFlag::class.java)
                        intent.putExtra(ConstanB.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(ConstanB.TOTAL_QUESTIONS, mQuestionsList!!.size)
                        startActivity(intent)
                    }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if(question!!.correctAnswern != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnswern, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmitn.text = "FINISH"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOnen.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwon.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreen.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFourn.background = ContextCompat.getDrawable(this,drawableView)
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