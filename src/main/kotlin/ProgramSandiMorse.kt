fun main(args: Array<String>) {
    // Contoh program decoder Morse code

    // String Morse code yang ingin kita decode
    val s =  ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message : $s")

    // Variabel untuk menampung hasil decode
    var message = ""

    // Definisi huruf alfabet (harusnya lengkap a–z, tapi di sini ada sedikit typo/kurang)
    val alphabetChars = "abcdefghijklmnovqrstuvwxyz"

    // Array berisi representasi Morse untuk setiap huruf alfabet
    val morseChars = arrayOf(
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
        ".--", "-..-", "-.--", "--.."
    )

    // Pisahkan string Morse berdasarkan spasi menjadi potongan karakter Morse
    val characters = s.split(" ")

    // Iterasi tiap potongan Morse
    for (morseChar in characters) {
        // Cari posisi/indeks morseChar di dalam array morseChars
        val index = morseChars.indexOf(morseChar)

        // Jika ketemu (index != -1), ambil huruf alfabet sesuai posisi yang sama
        if (index != -1) {
            message += alphabetChars[index]
        }
    }

    // Cetak hasil pesan setelah didecode
    println("The decoded message: $message")
}
