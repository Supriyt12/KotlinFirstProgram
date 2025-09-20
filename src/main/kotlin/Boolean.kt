fun main(args: Array<String>) {
    // Deklarasi variabel Boolean dengan nilai true
    var varBool: Boolean = true

    // Mengecek apakah varBool bernilai true
    if (varBool)
        println("varBool bernilai $varBool")

    // Deklarasi variabel Int dengan nilai 1
    var varInt: Int = 1

    // Mengecek apakah varInt bernilai 1
    if (varInt == 1)
        println("varInt bernilai $varInt")

    // Catatan:
    // if (varInt) -> tidak bisa digunakan di Kotlin
    // karena if hanya menerima ekspresi Boolean
    // Jadi harus ditulis if (varInt == 1)
}
