fun main(args: Array<String>) {
    val myName : String = "Supriyanto"
    for (chr in myName){
        print(chr)
    }
    print('\n')

    // String tipe dengan Operator  +

     val s = "abc" + 1
    println(s +"def" )

    // Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan
    //raw String yang dipisahkan dengan triple quotes (""").

    var text = """
        for ( c in "foo")
            print (c)
                
    """
    println(text)

    // Kita juga dapat menghapus spasi yang tidak diperlukan dalam raw String seperti contoh kode

    var text1  = """
        | Tell me and I forget.
        | Teach me  and I  remember.
        |Involve me and I learn.
        |(Benjamin Franklin)

    """.trimMargin()
    println(text1)

}