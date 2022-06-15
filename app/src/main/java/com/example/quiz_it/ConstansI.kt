package com.example.quiz_it

object ConstansI {
    const val TOTAL_QUESTIONS: String= "total_questions"
    const val CORRECT_ANSWERS: String= "correct_answers"
    fun getQuestions(): ArrayList<QuestionI>{
        val questionsList = ArrayList<QuestionI>()

        val que1= QuestionI(1,"Hewan yang memiliki metaforfosis sempurna adalah ?",
            "lalat rayap",
            "lebah belalang",
            "nyamuk dan lebah",
            "jangkrik kecoa",
            3
        )

        questionsList.add(que1)

        val que2= QuestionI(2,"Tumbuhan bakau yang tumbuh di daerah pantai bermanfaat untuk?",
            "Mencegah tsunami",
            "Mencegah banjir",
            "Mencegah abrasi",
            "Mencegah longsor",
            3
        )

        questionsList.add(que2)

        val que3= QuestionI(3,"Kambing, Gajah, Tikus, Kera. Hewan-hewan tersebut dikelompokan didasarkan?",
            "cara berkembang biak",
            "cara makan",
            "cara adaptasi",
            "tempat hidup",
            1
        )

        questionsList.add(que3)

        val que4= QuestionI(4,"Ciri khusus hewan cicak adalah?",
            "kepala dan ekor yang panjang",
            "kulit yang berubah warna",
            "badang yg licin",
            "bisa memutuskan ekor",
            4
        )

        questionsList.add(que4)

        val que5= QuestionI(5,"Hewan yang dilindungi udang- udang adalah?",
            "Harimau, sapi, banteng",
            "harimau komodo, cendrawasih",
            "buaya, bunglok, biawak",
            "gajah kera kambing",
            2
        )

        questionsList.add(que5)

        val que6= QuestionI(6,"Masih kecil hitam, tetapi kalau sudah besar menjadi putih, apakah itu?",
            "Cumi-Cumi",
            "Rambut",
            "Ayam",
            "Ikan",
            2
        )

        questionsList.add(que6)

        val que7= QuestionI(7,"Pelestarian gajah di Taman Nasional Way Kambas bertujuan untuk ….?",
            "mempertahankan populasinya",
            "menjaga habitat alami gajah",
            "mengurangi jenisnya",
            "melestarikan flora",
            1
        )

        questionsList.add(que7)

        val que8= QuestionI(8,"Petani mengalami gagal panen karena serangan hama wereng. Tahapan daur hidup wereng yang merugikan petani adalah ….",
            "pupa",
            "nimfa",
            "dewasa",
            "telur",
            3
        )

        questionsList.add(que8)

        val que9= QuestionI(9,"Berikut ini yang BUKAN merupakan ciri-ciri umum yang ditemukan pada makhluk hidup adalah?",
            "bernapas",
            "bergerak",
            "tumbuh dan berkembang",
            "berdiam diri",
            4
        )

        questionsList.add(que9)

        val que10= QuestionI(10,"Kemampuan makhluk hidup untuk memperoleh keturunan disebut?",
            "Berkembang biak (reproduksi)",
            "Tumbuh dan berkembang",
            "Menyesuaikan diri dengan lingkungan",
            "Bertahan hidup atau survive",
            1
        )

        questionsList.add(que10)
        return questionsList


    }

}
