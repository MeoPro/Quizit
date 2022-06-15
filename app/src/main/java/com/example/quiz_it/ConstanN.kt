package com.example.quiz_it

object ConstanN {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionN>{
        val questionsList = ArrayList<QuestionN>()

        val que1= QuestionN(1,"kapan buaya bisa mengeluarkan lidah mereka?",
            "Kapan saja",
            "Malam",
            "Makan",
            "Tidak bisa",
            4
        )

        questionsList.add(que1)

        val que2= QuestionN(2,"Warna keringat kudanil adalah?",
            "Bening",
            "Coklat",
            "Pink",
            "Hijau",
            3
        )

        questionsList.add(que2)

        val que3= QuestionN(3,"Kupu-kupu merasakan makanan dengan?",
            "Kaki",
            "Antena",
            "Ekor",
            "Mulut",
            1
        )

        questionsList.add(que3)

        val que4= QuestionN(4,"Letak gigi kepiting berada dimana?",
            "Mulut",
            "Perut",
            "Capit",
            "Cangkang",
            2
        )

        questionsList.add(que4)

        val que5= QuestionN(5,"Dimana letak paru-paru semut?",
            "Ekor",
            "Dada",
            "Perut",
            "Tidak ada",
            4
        )

        questionsList.add(que5)

        val que6= QuestionN(6,"Gurita memiliki berapa jantung?",
            "1",
            "3",
            "5",
            "8",
            2
        )

        questionsList.add(que6)

        val que7= QuestionN(7,"Warna darah gurita adalah?",
            "Merah",
            "Putih",
            "Hitam",
            "Biru",
            4
        )

        questionsList.add(que7)

        val que8= QuestionN(8,"Berapa lama ingatan ikan?",
            "Selamanya",
            "1 hari",
            "10 detik",
            "3 detik",
            2
        )

        questionsList.add(que8)

        val que9= QuestionN(9,"Dibawah ini yang bukan mamalia adalah?",
            "Paus",
            "Tringgiling",
            "Kecoa",
            "Platipus",
            3
        )

        questionsList.add(que9)

        val que10= QuestionN(10,"Burung apa yang bisa terbang mundur?",
            "Burung merpati",
            "Burung merak",
            "Burung kolibri",
            "Burung elang",
            3
        )

        questionsList.add(que10)
        return questionsList


    }

}
