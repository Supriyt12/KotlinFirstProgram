fun main(args: Array<String>) {
    // Analisis jumlah huruf vokal dan konsonan dalam sebuah kalimat

    // String yang akan dianalisis
    var s =
        "A programmer gets stuck in the shower because the instructions on the shampoo were: Lather,Wash, and Repeat."
    println(s) // Menampilkan string asli

    // Ubah string menjadi huruf kecil semua agar mudah dihitung
    s = s.toLowerCase()

    // Inisialisasi counter untuk menghitung jumlah vokal dan konsonan
    var vowelCount = 0
    var consonantCount = 0

    // Definisi kelompok huruf vokal
    val vowels = "aeiouy"
    // Definisi kelompok huruf konsonan
    val consonants = "bcdfghjklmnpqrstvwxz"

    // Loop utama untuk memeriksa setiap karakter dalam string
    for (c in s) {
        // Jika karakter termasuk vokal
        if (vowels.contains(c)) {
            vowelCount++
        }
        // Jika karakter termasuk konsonan
        else if (consonants.contains(c)) {
            consonantCount++
        }

        // Menampilkan jumlah sementara setelah memeriksa setiap karakter
        println("Vowels: $vowelCount")
        println("Consonants: $consonantCount")
        // Karakter lain dihitung sebagai total panjang string - (vokal + konsonan)
        println("Other characters: ${s.length - (vowelCount + consonantCount)}")
    }
}
