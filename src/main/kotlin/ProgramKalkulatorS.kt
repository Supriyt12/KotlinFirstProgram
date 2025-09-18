fun main(args: Array<String>) {
    // Program sederhana kalkulator dengan Kotlin

    // Menampilkan sambutan awal ke pengguna
    println("Welcome to calculator")

    // Meminta input angka pertama dari user
    println("Enter the first number:")
    val a = readLine()!!.toDouble()   // Membaca input lalu diubah ke Double

    // Meminta input angka kedua dari user
    println("Enter the second number:")
    val b =  readLine()!!.toDouble()  // Membaca input lalu diubah ke Double

    // Operasi aritmatika dasar
    val sum = a + b           // Penjumlahan
    val difference = a - b    // Pengurangan
    val product = a * b       // Perkalian
    val question = a / b      // Pembagian

    // Menampilkan hasil operasi
    println("Sum : ${sum}")           // Menampilkan hasil penjumlahan
    println("Difference : ${difference}") // Menampilkan hasil pengurangan
    println("Product : ${product}")       // Menampilkan hasil perkalian
    println("Question : ${question}")     // Menampilkan hasil pembagian

    // Pesan penutup
    println("Thank you for using calculator")
}
