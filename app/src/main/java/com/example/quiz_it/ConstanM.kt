package com.example.quiz_it

object ConstanM {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionM>{
        val questionsList = ArrayList<QuestionM>()

        val que1= QuestionM(1,"1 mobil bisa bawa 6 orang, jika mobil ada 9, maka berapa orang yang bisa dibawa?",
            "18",
            "50",
            "54",
            "90",
            3
        )

        questionsList.add(que1)

        val que2= QuestionM(2,"12 mobil punya berapa roda(semua ban yang ada dimobil)?",
            "24",
            "36",
            "48",
            "60",
            4
        )

        questionsList.add(que2)

        val que3= QuestionM(3,"69 x 3 + 64 x 64 - 8000?",
            "1000",
            "70101",
            "443",
            "500",
            3
        )

        questionsList.add(que3)

        val que4= QuestionM(4,"1 + 1?",
            "Beyonce",
            "Jendela",
            "Dua",
            "Sebelas",
            1
        )

        questionsList.add(que4)

        val que5= QuestionM(5,"35 + 34?",
            "Ariana grande",
            "69",
            ";)",
            "Lagu A6",
            2
        )

        questionsList.add(que5)

        val que6= QuestionM(6,"Kalo 1=4 2=3 3=4 4=5 5=4 6=?",
            "1",
            "2",
            "3",
            "4",
            4
        )

        questionsList.add(que6)

        val que7= QuestionM(7,"Didalam aquairum ada 5 ikan, 3 mati maka sisa berapa ikan di aquarium?",
            "2",
            "0",
            "5",
            "8",
            5
        )

        questionsList.add(que7)

        val que8= QuestionM(8,"Pak darell punya 5 bebek dikandang, dikali 3 berapa total bebek?",
            "5",
            "3",
            "15",
            "8",
            4
        )

        questionsList.add(que8)

        val que9= QuestionM(9,"Jika perlu waktu merebus 20 menit agar sebutir telur bisa matang, berapa lama waktu merebus yang dibutuhkan agar 10 butir telur bisa matang?",
            "20 menit",
            "10 menit",
            "30 menit",
            "15 menit",
            1
        )

        questionsList.add(que9)

        val que10= QuestionM(10,"Apakah yang lebih berat antara kapas 10 kg atau besi 5 kg?",
            "Kepas",
            "Beso",
            "Hidupku",
            "Sama",
            4
        )

        questionsList.add(que10)
        return questionsList


    }

}
