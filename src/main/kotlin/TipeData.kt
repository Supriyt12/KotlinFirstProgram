fun main(args: Array<String>) {
    // Tipe data Byte: -128 sampai 127 (8 bit)
    val minByte: Byte = -128
    val maxByte: Byte = 127

    // Tipe data Short: -32,768 sampai 32,767 (16 bit)
    val minShort: Short = -32768
    val maxShort: Short = 32767

    // Tipe data Int: -2,147,483,648 sampai 2,147,483,647 (32 bit)
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647

    // Tipe data Long: -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807 (64 bit)
    // Di sini kamu kasih contoh nilai Long dengan angka besar
    val minLong: Long = -1234567890
    val maxLong: Long = 1234567890

    // Menampilkan nilai Byte, Short, Int, Long
    println("minByte: " + minByte)
    println("maxByte: " + maxByte)
    println("minShort: " + minShort)
    println("maxShort: " + maxShort)
    println("minInt: " + minInt)
    println("maxInt: " + maxInt)
    println("minLong: " + minLong)
    println("maxLong: " + maxLong)

    // Tipe data Float: presisi 6–7 digit (32 bit, pakai f di belakang)
    val maxFloat: Float = 9.123456789f

    // Tipe data Double: presisi 15–16 digit (64 bit, default untuk angka desimal)
    val maxDouble: Double = 9.123456789

    // Menampilkan nilai Float dan Double
    println("maxFloat: " + maxFloat)
    println("maxDouble: " + maxDouble)
}
