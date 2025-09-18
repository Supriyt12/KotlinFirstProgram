fun main(args: Array<String>) {
    // Variabel a bertipe Int (nilai primitif, bukan objek)
    val a : Int = 1000

    // Mengecek apakah a identik dengan dirinya sendiri
    // === digunakan untuk cek identitas (apakah objek di memori sama)
    println("a apakah identik dengan a atau a === a: " + (a === a)) // true

    // Autoboxing: a dikonversi ke Int? (nullable) sehingga menjadi objek
    val boxedA : Int? = a
    val anotherBoxedA: Int? = a

    // Mengecek apakah boxedA dan anotherBoxedA adalah objek yang sama di memori
    println("boxedA apakah identik dengan anotherBoxedA atau boxedA === anotherBoxedA : " + (boxedA === anotherBoxedA)) // false

    // Mengecek apakah boxedA dan anotherBoxedA memiliki nilai yang sama
    // == digunakan untuk cek kesamaan nilai (memanggil equals())
    println("boxedA apakah memiliki nilai yang sama dengan anotherBoxedA atau boxedA == anotherBoxedA : " + (boxedA == anotherBoxedA)) // true
}
