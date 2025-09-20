fun main(args: Array<String>) {
    // Program "parrot" sederhana
    // Parrot artinya burung beo, program ini menirukan (mengulang) apa yang kita ketik

    // Cetak sapaan awal dari "parrot"
    println("Hi I’m Lora, the virtual parrot, and I love to repeat !")

    // Minta pengguna mengetik sesuatu
    println("Type something in: ")

    // Deklarasi variabel untuk menampung input pengguna
    var input: String
    // Membaca input dari keyboard (readLine) dan pastikan nilainya tidak null (!!)
    input = readLine()!!

    // Deklarasi variabel untuk menampung output
    var output: String
    // Output dibuat dengan cara mengulang input dua kali
    output = input + ", " + input + "!"

    // Cetak hasil output (parrot menirukan apa yang diketik)
    println(output)
}
