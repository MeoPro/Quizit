package com.example.quiz_it

object ConstanP {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionP>{
        val questionsList = ArrayList<QuestionP>()

        val que1= QuestionP(1,"Siapakah presiden ketiga indonesia?",
            "Megawati",
            "M. Hatta",
            "Naruto",
            "B.J Habibie",
            4
        )

        questionsList.add(que1)

        val que2= QuestionP(2,"Siapakah presiden yang memiliki jabatan terlama?",
            "Jokowi",
            "Soekarno",
            "Megawati",
            "Soeharto",
            4
        )

        questionsList.add(que2)

        val que3= QuestionP(3,"Siapakah ketua BPUKI?",
            "M. Hatta",
            "BAPAKMU-!!",
            "Soekarno",
            "dr. radjiman widyodiningrat",
            4
        )

        questionsList.add(que3)

        val que4= QuestionP(4,"Berapa banyak sila pancasila?",
            "0+12-7-2",
            "Banyak",
            "7+3-5+7-10",
            "5+0-0+15-20+5+5-10+5",
            4
        )

        questionsList.add(que4)

        val que5= QuestionP(5,"Bunyi ketuhanan yang maha esa adalah sila ke-?",
            "Tan 45",
            "Sin 30",
            "Cos 90",
            "90 x 100 - 99 + 5 - 7",
            1
        )

        questionsList.add(que5)

        val que6= QuestionP(6,"Bunyi Manusia yang adil dan beradab adlaah sila ke-?",
            "Sin 30 + Sin 30 + Tan 45",
            "3 x 3 - 3",
            "4",
            "Cos 90",
            1
        )

        questionsList.add(que6)

        val que7= QuestionP(7,"Jika teman kamu mengijak rumput, apa yang akan kamu lakukan?",
            "Ajak main bola",
            "Injak bareng-bareng",
            "saya tidak punya teman",
            "Menegurnya",
            2
        )

        questionsList.add(que7)

        val que8= QuestionP(8,"Arti merah putih?",
            "Merah adalah darah dan putih adalah susu",
            "Merah adalah darah dan putih adalah tulang",
            "Merah adalah sirup dan putih adalah darah",
            "Merah adalah tulang dan putih adalah susu",
            2
        )

        questionsList.add(que8)

        val que9= QuestionP(9,"Teman saya suka mambantah orang tua, apa yang harus saya lakukan?",
            "Tidak ikut campur",
            "Menegurnya",
            "Ikut membantah",
            "Menasehatinya",
            4
        )

        questionsList.add(que9)

        val que10= QuestionP(10,"Berapa lama soekarno menjabat presiden?",
            "30 tahun",
            "5 tahun",
            "10 tahun",
            "22 tahun",
            4
        )

        questionsList.add(que10)
        return questionsList


    }

}
