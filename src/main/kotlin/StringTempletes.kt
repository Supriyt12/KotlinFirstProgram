fun main(args: Array<String>) {
    // Mendeklarasikan variabel a dengan nilai 7
    val a = 7
    // Mendeklarasikan variabel b dengan nilai 8
    val b = 8
    // Menjumlahkan a dan b, hasilnya disimpan di variabel c
    val c = a + b

    // Membuat string dengan interpolasi variabel a, b, dan c
    val s = "When we add  $a and  $b, we get  $c"
    println(s) // Mencetak string s ke layar

    // Cara lain langsung menggunakan ekspresi dalam string template
    println("When we add $a and $b, we get  ${a + b} ")

    // Membuat string multiline dengan triple quotes (""" """)
    val price = """
        
    """

    // Mencetak isi variabel price
    println(price)
}
