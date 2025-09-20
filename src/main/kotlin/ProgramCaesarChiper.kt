fun main(args: Array<String>) {
    // Caesar cipher sederhana (geser huruf dengan shift tertentu)

    // Pesan asli yang akan dienkripsi
    val s = "blackholesarewheregoddividedbyzero"
    println("Original message : $s")

    // Variabel untuk menampung hasil enkripsi
    var message = ""

    // Jumlah pergeseran huruf (shift 1 berarti A->B, B->C, dst.)
    var shift = 1

    // Loop untuk membaca setiap karakter dari string s
    for (c in s) {
        // Ubah karakter menjadi nilai ASCII/Unicode (integer)
        var i = c.toInt()

        // Geser nilai karakter sesuai shift
        i += shift

        // Jika melewati huruf 'z', kembali ke awal abjad
        if (i > 'z'.toInt()) {
            i -= 26
        }

        // Ubah kembali ke karakter
        val char = i.toChar()

        // Tambahkan karakter terenkripsi ke message
        message += char
    }

    // Cetak hasil enkripsi
    println("Encrypted message: $message")
}
