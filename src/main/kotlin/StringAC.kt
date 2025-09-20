fun main(args: Array<String>) {
    // Membuat variabel String
    val myName: String = "Supriyanto"

    // Perulangan for untuk membaca setiap karakter dalam String
    for (chr in myName) {
        print(chr) // mencetak karakter satu per satu
    }
    print('\n') // pindah baris setelah selesai mencetak

    // String bisa digabungkan dengan operator +
    val s = "abc" + 1 // hasilnya "abc1"
    println(s + "def") // hasilnya "abc1def"

    // Raw String menggunakan triple quotes (""")
    // Raw String bisa menyimpan teks apa adanya termasuk spasi dan enter
    var text = """
        for ( c in "foo")
            print (c)
    """
    println(text)

    // Raw String bisa dirapikan dengan trimMargin()
    // Tanda '|' dipakai sebagai penanda margin yang ingin dipotong
    var text1 = """
        | Tell me and I forget.
        | Teach me  and I  remember.
        | Involve me and I learn.
        | (Benjamin Franklin)
    """.trimMargin()
    println(text1)
}
