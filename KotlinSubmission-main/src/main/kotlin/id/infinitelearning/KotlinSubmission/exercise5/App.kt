package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */



    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */



    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */




    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */

    class Hero {
        var name: String = ""
        var age: Int = 0
        var height: Double = 0.0
    }

    fun setProfile(hero: Hero, name: String, age: Int, height: Double) {
        hero.name = name
        hero.age = age
        hero.height = height
    }

    fun printProfile(hero: Hero) {
        println("Name: ${hero.name}")
        println("Age: ${hero.age}")
        println("Height: ${hero.height}")
    }

    fun main() {
        val hero = Hero()

        // Latihan 1
        // Isi nilai variabel hero dengan class Hero
        // Contoh: val hero = Hero()

        // Latihan 2
        setProfile(hero, "safrizal cahya", 21, 181.0)
        // Isi argumen-argumen dengan data diri Anda
        // Contoh: setProfile(hero, "Nama Anda", Usia Anda, Tinggi Anda)

        // Latihan 3
        println("Data Profile Sebelum Aktivitas:")
        printProfile(hero)

        // Challenge: Aktivitas
        val activities = listOf("jalan", "lari", "makan", "minum", "lompat", "duduk")
        val activityCounts = listOf(
            listOf(5, 2, 3, 1, 3, 1),
            listOf(2, 2, 1, 3, 1, 2),
            listOf(3, 1, 5, 1, 5, 3),
            listOf(5, 4, 4, 4, 3, 2),
            listOf(4, 1, 3, 5, 5, 3),
            listOf(2, 4, 2, 2, 7, 4)
        )

        // Latihan 4
        for (i in activityCounts.indices) {
            val group = i + 1
            println("Group $group")
            for (j in activities.indices) {
                val count = activityCounts[i][j]
                for (k in 1..count) {
                    println("Aktivitas ${activities[j]} ke-$k")
                }
            }
            println()
        }

        // Latihan 5
        println("Data Profile Setelah Aktivitas:")
        printProfile(hero)
    }

}