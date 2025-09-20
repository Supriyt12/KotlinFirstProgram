fun main(args: Array<String>) {
    // Mendeklarasikan sebuah variabel bertipe Char
    var CharA: Char = 'A'

    // Mengecek apakah CharA huruf besar
    println(CharA.isUpperCase()) // true karena 'A' adalah huruf besar
    // Mengecek apakah CharA huruf kecil
    println(CharA.isLowerCase()) // false karena 'A' bukan huruf kecil
    // Mengecek apakah CharA sebuah angka
    println(CharA.isDigit()) // false karena 'A' bukan angka
    // Mengubah 'A' menjadi huruf kecil
    println(CharA.toLowerCase()) // a
    // Mengubah Char menjadi String
    val strA: String = CharA.toString()
    println("Kini CharA sudah menjadi String = " + strA)

    // Konversi eksplisit antara Char dan ASCII
    var c: Char // karakter
    var i: Int  // nilai ASCII dari karakter

    // Konversi dari karakter ke ASCII
    c = 'a'
    i = c.toInt() // mendapatkan nilai ASCII dari 'a'
    println("The Character $c was converted to its textual value of $i")

    // Konversi dari ASCII ke karakter
    i = 98
    c = i.toChar() // mendapatkan karakter dari nilai ASCII 98
    println("The ASCII value of $i was converted to its textual value of $c")
}
