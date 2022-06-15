package com.example.quiz_it

object Constants {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionsF>{
        val questionsList = ArrayList<QuestionsF>()

        val que1= QuestionsF(1,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Belgium",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que1)

        val que2= QuestionsF(2,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_belgium,
            "Brazil",
            "Belgium",
            "Germany",
            "India",
            2
        )

        questionsList.add(que2)

        val que3= QuestionsF(3,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Belgium",
            "Austria",
            "Brazil",
            1
        )

        questionsList.add(que3)

        val que4= QuestionsF(4,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_kuwait,
            "Somalia",
            "Africa",
            "India",
            "Kuwait",
            4
        )

        questionsList.add(que4)

        val que5= QuestionsF(5,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Brazil",
            "Australia",
            "Indonesia",
            2
        )

        questionsList.add(que5)

        val que6= QuestionsF(6,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_denmark,
            "Austria",
            "Belgium",
            "England",
            "Denmark",
            4
        )

        questionsList.add(que6)

        val que7= QuestionsF(7,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "New Zealand",
            "Australia",
            "Romania",
            1
        )

        questionsList.add(que7)

        val que8= QuestionsF(8,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_india,
            "Somalia",
            "India",
            "Wales",
            "Romania",
            2
        )

        questionsList.add(que8)

        val que9= QuestionsF(9,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_new_zealand,
            "Finland",
            "Belgium",
            "New Zealand",
            "America",
            3
        )

        questionsList.add(que9)

        val que10= QuestionsF(10,"Ini Merupakan Bendera Dari Negara Apa?",
            R.drawable.ic_flag_of_germany,
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
}