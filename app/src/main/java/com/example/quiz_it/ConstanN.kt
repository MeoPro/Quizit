package com.example.quiz_it

object ConstanN {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionN>{
        val questionsList = ArrayList<QuestionN>()

        val que1= QuestionN(1,"Ini Merupakan Bendera Dari Negara Apa?",
            "Argentina",
            "Belgium",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que1)

        val que2= QuestionN(2,"Ini Merupakan Bendera Dari Negara Apa?",
            "Brazil",
            "Belgium",
            "Germany",
            "India",
            2
        )

        questionsList.add(que2)

        val que3= QuestionN(3,"Ini Merupakan Bendera Dari Negara Apa?",
            "Australia",
            "Belgium",
            "Austria",
            "Brazil",
            1
        )

        questionsList.add(que3)

        val que4= QuestionN(4,"Ini Merupakan Bendera Dari Negara Apa?",
            "Somalia",
            "Africa",
            "India",
            "Kuwait",
            4
        )

        questionsList.add(que4)

        val que5= QuestionN(5,"Ini Merupakan Bendera Dari Negara Apa?",
            "Argentina",
            "Brazil",
            "Australia",
            "Indonesia",
            2
        )

        questionsList.add(que5)

        val que6= QuestionN(6,"Ini Merupakan Bendera Dari Negara Apa?",
            "Austria",
            "Belgium",
            "England",
            "Denmark",
            4
        )

        questionsList.add(que6)

        val que7= QuestionN(7,"Ini Merupakan Bendera Dari Negara Apa?",
            "Fiji",
            "New Zealand",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que7)

        val que8= QuestionN(8,"Ini Merupakan Bendera Dari Negara Apa?",
            "Somalia",
            "India",
            "Wales",
            "Romania",
            2
        )

        questionsList.add(que8)

        val que9= QuestionN(9,"Ini Merupakan Bendera Dari Negara Apa?",
            "Finland",
            "Belgium",
            "New Zealand",
            "America",
            3
        )

        questionsList.add(que9)

        val que10= QuestionN(10,"Ini Merupakan Bendera Dari Negara Apa?",
            "France",
            "Belgium",
            "Germany",
            "Romania",
            3
        )

        questionsList.add(que10)
        return questionsList


    }

}
