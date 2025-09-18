fun main(args: Array<String>) {
    // Deklarasi variabel dengan tipe Int tanpa nilai awal
    var varVariabel: Int

    // Memberikan nilai pertama ke varVariabel
    varVariabel = 56
    println("Pemberian nilai pertama pada varVariabel = " + varVariabel)

    // Memberikan nilai kedua ke varVariabel (nilai lama ditimpa)
    varVariabel = 78
    println("Pemberian nilai kedua pada varVariabel = " + varVariabel)

    // Deklarasi konstanta menggunakan val (immutable / tidak bisa diubah)
    val phi = 3.14

    // Error: Tidak bisa mengubah nilai konstanta
    //phi = 2.5  // <-- ini akan menyebabkan error saat compile
}
