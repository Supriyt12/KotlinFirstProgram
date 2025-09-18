fun main(args: Array<String>) {
    // Angka satu juta, pakai underscore (_) supaya mudah dibaca
    val oneMillion = 1_000_000

    // Nomor kartu kredit (tipe Long, ditandai dengan huruf L di akhir)
    val creditCardNumber = 124_5678_9012_3456L

    // Nomor identitas sosial (juga Long)
    val socialSecurityNumber = 999_99_9999L

    // Angka dalam format heksadesimal (basis 16), underscore dipakai untuk pemisah
    val hexByte = 0xFF_EC_DE_5E

    // Angka dalam format biner (basis 2), juga bisa dipisahkan dengan underscore
    val bytes = 0b11010010_01101001_10010100_10010010

    // Menampilkan semua nilai
    println("oneMillion = " + oneMillion)
    println("creditCardNumber = " + creditCardNumber)
    println("socialSecurityNumber = " + socialSecurityNumber)
    println("hexByte = " + hexByte)
    println("bytes = " + bytes)
}
