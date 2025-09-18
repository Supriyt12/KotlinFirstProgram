fun main(args: Array<String>) {
    var CharA  : Char = 'A'
    //println(CharA == 65) (x)

    println(CharA.isUpperCase())
    println(CharA.isLowerCase())
    println(CharA.isDigit())
    println(CharA.toLowerCase())
    val strA : String = CharA.toString()
    println("Kini CharA sudah menjadi String = " + strA)

    //ASCII value (Konversio Eksplisit pada Char)

    var c : Char // character
    var i : Int // ordinal (ASCII) value of the character

    // conversion from text to ASCII value

    c = 'a'
    i = c.toInt()
    println("The Character $c was converted to its textual value pf $i")

    // conversion from on ASCII value to text
    i = 98
    c = i.toChar()
    println("The ASCII value of $i was converted its textual value of $c")

}