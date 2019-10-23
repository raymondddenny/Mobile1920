package com.github.raymondddenny.tomAndJerry

import android.app.Application

class MyApplication: Application() {

    data class Scene(
        val title: String,
        val body: String,
        val actions: List<String>
    )

    companion object {
        // Constants
        val MAIN_MENU = "Main Menu"
        val TRY_AGAIN = "Try Again"


        // Scenes
        val scenes: List<Scene> = listOf (
            // 0
            Scene (
                "Welcome to Tom and Jerry",
                "Ini adalah cerita singkat tentang Tom si kucing and Jerry si tikus ",


                    actions = listOf (
                    "Ayo Mulai"
                )
            ),

            // 1
            Scene (
                "Midnight Snack",
                "Jerry sedang kelaparan tengah malam, dan jerry pun membuka kulkas didalam rumah dan ingin mengambil sebongkah keju. Tetapi disaat dia ingin membawa kembali keju ini. Tiba-tiba Tom sikucing muncul, apa yang Jerry harus lakukan ?",
                actions = listOf (
                    "Lari dengan membawa keju yang sedang dipegangnya",
                    "Berpura-pura tidak melihat tom sikucing dan tetap berjalan dengan keju secara perlahan"
                )
            ),

            // 2
            Scene (
                "Berpura-pura tidak melihat",
                "Ternyata Tom berpura-pura tidak melihat jerry, tetapi ketika jerry mulai berjalan lagi tom pun mulai menarohkan barang-barang diatas keju yang sedang dipegang jerry.Jerry pun berjalan keberatan. Apa yang kira-kira terjadi selanjutnya?",
                actions = listOf (
                    "Keju dan barang yang lain yang sedang dipegang terjatuh. Jerrypun marah memukuli tom sikucing",
                    "Keju dan barang yang lain yang sedang dipegang terjatuh. Tetapi jerry tetap santai dan tidak terjadi apa-apa."

                )
            ),

            // 3
            Scene (
                "Jerry Membawa Keju Kembali",
                "Jerry akhirnya membawa kembali keju yang dia bawa, dan mengembalikan lagi kedalam kulkas. Namun ternyata jerry masih lapar, kira-kira apa yang dilakukan jerry berikutnya ?",
                actions = listOf (
                    "Mengambil sebongkah kecil keju dan berusaha lari dari tom sikucing",
                    "Tidak mengambil apa-apa dan langsung kembali ke dalam rumahnya dan kelaparan sepanjang malam"

                )
            ),

            // 4
            Scene (
                "Tom menangkap Jerry",
                "Tom pun akhirnya menangkap jerry, tetapi dengan keusilannya dia menahan ekor jerry dengan sebuah setrika, sehingga jerry tidak bisa pergi kemana-mana. Kira-kira apa yang dilakukan tom sikucing berikutnya ?",
                actions = listOf (
                    "Memakan Jerry",
                    "Berjalan kearah kulkas untuk memakan makanan yang ada didalam kulka"

                )
            ),

            // 5
            Scene (
                "Keusilan Tom",
                "Setelah memakan beberapa makanan didalam kulkas timbulah rasa usil dalam diri Tom, dia pun ingin membuat jerry merasa lapar. Tom pun mulai membawa makanan kepada jerry tetapi hanya  bermaksud untuk mengerjai jerry. Dan tidak sengaja pada saat itu Tom sedang memegang sebongkah keju, tapi karena dia tidak menyukai baunya, Tom pun membuang bongkahan Keju itu. Tebak apa yang terjadi kemudian ?",
                actions = listOf (
                    "Keju itu mengenai kaca ruangan lain dan memecahkan kaca diruangan itu sehingga Tuan Rumah terbangun dan mencari Tom sikucing",
                    "Keju itu mengenai kaca ruangan lain dan memecahkan kaca diruangan itu, Tom pun lari dari rumah dan akhirnya jerry dapat bebas dan memakan keju yang diingini"

                )
            ),

            // 6
            // Bad Ending
            Scene (
                "BAD ENDING : Jerry Mati",
                "Jerry akhirnya dimakan oleh Tom sikucing",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN

                )
            ),

            // Normal Ending sscene 7
            Scene (
                "NORMAL ENDING: Tom memakan seisi kulkas",
                "Selama tom memakan makanan di dalam kulkas ternyata jerry berusaha untuk melarikan diri, tetapi tom mengetahuinya dan akhirnya jerry tidak bisa meloloskan diri. ",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN

                )
            ),

            // scene 8 BEST
            Scene (
                "BEST ENDING: Jerry Memakan Keju",
                "Jerry akhirnya dapat memakan keju dan hidup bahagia",
                actions = listOf (
                    MAIN_MENU,
                    TRY_AGAIN
                )
            )

            )

        // Ending flags
        var badEnding = false
        var normalEnding = false
        var bestEnding = false

        // Utils
        lateinit var currentDisplayedEnding: Scene
    }
}