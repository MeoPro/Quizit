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
import com.example.quiz_it.databinding.ActivityPknBinding


class  Pkn: AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<QuestionP>? = null
    private var mSelectedOptionPosition : Int = 0
    private var mCorrectAnswers : Int = 0

    private lateinit var binding: ActivityPknBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        binding = ActivityPknBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionsList = ConstanP.getQuestions()

        setQuestion()

        binding.tvOptionOnep.setOnClickListener(this)
        binding.tvOptionTwop.setOnClickListener(this)
        binding.tvOptionThreep.setOnClickListener(this)
        binding.tvOptionFourp.setOnClickListener(this)
        binding.btnSubmitp.setOnClickListener(this)
    }

    private fun setQuestion(){

        val question = mQuestionsList!!.get(mCurrentPosition-1)

        deafultOptionsView()

        if (mCurrentPosition == mQuestionsList!!.size){
            binding.btnSubmitp.text = "FINISH"
        }else{
            binding.btnSubmitp.text = "SUBMIT"
        }

        binding.progressBarp.progress = mCurrentPosition
        binding.tvProgressp.text = "$mCurrentPosition" + "/" + binding.progressBarp.max

        binding.tvQuestionp.text= question!!.questionbp
        binding.tvOptionOnep.text = question.optionOnep
        binding.tvOptionTwop.text = question.optionTwop
        binding.tvOptionThreep.text = question.optionThreep
        binding.tvOptionFourp.text = question.optionFourp
    }

    private fun deafultOptionsView(){
        val options = ArrayList<TextView>()
        options.add( 0, binding.tvOptionOnep)
        options.add( 1, binding.tvOptionTwop)
        options.add( 2, binding.tvOptionThreep)
        options.add( 3, binding.tvOptionFourp)

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this, com.example.quiz_it.R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            binding.tvOptionOnep.id ->{
                SelectedOptionView(binding.tvOptionOnep, 1)
            }
            binding.tvOptionTwop.id ->{
                SelectedOptionView(binding.tvOptionTwop, 2)
            }
            binding.tvOptionThreep.id ->{
                SelectedOptionView(binding.tvOptionThreep, 3)
            }
            binding.tvOptionFourp.id ->{
                SelectedOptionView(binding.tvOptionFourp, 4)
            }
            binding.btnSubmitp.id ->{

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
                    if(question!!.correctAnswerp != mSelectedOptionPosition){
                        AnswerView(mSelectedOptionPosition, com.example.quiz_it.R.drawable.wrong_option_border_bg)
                    }else{
                        mCorrectAnswers++
                    }
                    AnswerView(question.correctAnswerp, com.example.quiz_it.R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        binding.btnSubmitp.text = "FINISH"
                    }else{
                        binding.btnSubmitp.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun AnswerView(answer: Int, drawableView: Int){
        when(answer){
            1 ->{
                binding.tvOptionOnep.background = ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                binding.tvOptionTwop.background = ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                binding.tvOptionThreep.background = ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                binding.tvOptionFourp.background = ContextCompat.getDrawable(this,drawableView)
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