package com.example.quiz_it

object ConstanB {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionB>{
        val questionsList = ArrayList<QuestionB>()

        val que1= QuestionB(1,"Manakah sinonim yang benar Acum?",
            "Hasut",
            "Ceramah",
            "Marah",
            "Apresiasi",
            1
        )

        questionsList.add(que1)

        val que2= QuestionB(2,"Sinonim Melatis adalah?",
            "Melawan",
            "Melompat",
            "Menerobos",
            "Memarahi",
            3
        )

        questionsList.add(que2)

        val que3= QuestionB(3,"Sinonim getol adalah?",
            "Menumpang",
            "Gatal",
            "Nakal",
            "Gemar",
            4
        )

        questionsList.add(que3)

        val que4= QuestionB(4,"Sinonim dari Genjah adalah?",
            "Cepat besar",
            "Jatuh",
            "Cepat berubah",
            "Sangat hebat",
            3
        )

        questionsList.add(que4)

        val que5= QuestionB(5,"Sinonim dari jemawa adalah?",
            "Angkuh",
            "Jahat",
            "Berkelahi",
            "Melawan",
            1
        )

        questionsList.add(que5)

        val que6= QuestionB(6,"Antonim dari Elastis?",
            "Lembut",
            "Empuk",
            "Kaku",
            "Pendek",
            3
        )

        questionsList.add(que6)

        val que7= QuestionB(7,"Antonim dari Gratis?",
            "Memberi",
            "Dibayar",
            "Berbayar",
            "Membayar",
            3
        )

        questionsList.add(que7)

        val que8= QuestionB(8,"Antonim dari Indetik?",
            "Sama",
            "Berbeda",
            "Mirip",
            "Identitas",
            2
        )

        questionsList.add(que8)

        val que9= QuestionB(9,"Antonim dari kacau?",
            "Berantakan",
            "Kotor",
            "Teratur",
            "Bersih",
            3
        )

        questionsList.add(que9)

        val que10= QuestionB(10,"Antonim dari kasar adalah?",
            "Berat",
            "Ringan",
            "Lancar",
            "Halus",
            4
        )

        questionsList.add(que10)
        return questionsList


    }

}
