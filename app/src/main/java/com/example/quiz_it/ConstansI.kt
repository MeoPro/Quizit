package com.example.quiz_it

object ConstansI {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionI>{
        val questionsList = ArrayList<QuestionI>()

        val que1= QuestionI(1,"Ini Merupakan Bendera Dari Negara Apa?",
            "Argentina",
            "Belgium",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que1)

        val que2= QuestionI(2,"Ini Merupakan Bendera Dari Negara Apa?",
            "Brazil",
            "Belgium",
            "Germany",
            "India",
            2
        )

        questionsList.add(que2)

        val que3= QuestionI(3,"Ini Merupakan Bendera Dari Negara Apa?",
            "Australia",
            "Belgium",
            "Austria",
            "Brazil",
            1
        )

        questionsList.add(que3)

        val que4= QuestionI(4,"Ini Merupakan Bendera Dari Negara Apa?",
            "Somalia",
            "Africa",
            "India",
            "Kuwait",
            4
        )

        questionsList.add(que4)

        val que5= QuestionI(5,"Ini Merupakan Bendera Dari Negara Apa?",
            "Argentina",
            "Brazil",
            "Australia",
            "Indonesia",
            2
        )

        questionsList.add(que5)

        val que6= QuestionI(6,"Ini Merupakan Bendera Dari Negara Apa?",
            "Austria",
            "Belgium",
            "England",
            "Denmark",
            4
        )

        questionsList.add(que6)

        val que7= QuestionI(7,"Ini Merupakan Bendera Dari Negara Apa?",
            "Fiji",
            "New Zealand",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que7)

        val que8= QuestionI(8,"Ini Merupakan Bendera Dari Negara Apa?",
            "Somalia",
            "India",
            "Wales",
            "Romania",
            2
        )

        questionsList.add(que8)

        val que9= QuestionI(9,"Ini Merupakan Bendera Dari Negara Apa?",
            "Finland",
            "Belgium",
            "New Zealand",
            "America",
            3
        )

        questionsList.add(que9)

        val que10= QuestionI(10,"Ini Merupakan Bendera Dari Negara Apa?",
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
