package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    fun readNumber(): Int {
        print("Enter a number: ")
        val input = readLine()
        return input?.toInt() ?: throw NumberFormatException("Invalid input")
    }

    fun main() {
        try {
            val number = readNumber()
            println("Number: $number")
        } catch (e: NumberFormatException) {
            println("Error: Invalid number format!")
        }
    }

}