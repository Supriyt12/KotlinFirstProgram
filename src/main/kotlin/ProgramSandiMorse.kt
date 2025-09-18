fun main(args: Array<String>) {
    // split() and joinToString()
    // Morse code decoder
    // the string which we want to decode
    val s =  ".. -.-. - ... --- -.-. .. .- .-.."
    println("The original message : $s")

    // the string with the decoded message

    var message = ""

    // array definitions
    val alphabetChars = "abcdefghijklmnovqrstuvwxyz"
    val morseChars = arrayOf(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
        ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..")
    // splitting the string into Morse characters
    val characters = s.split(" ")
    // iterating over Morse characters
    for (morseChar in characters) {
        val index = morseChars.indexOf(morseChar)
        // character was found
        if (index != -1) {
            message += alphabetChars[index]
        }
    }
    println("The decoded message: $message")
}
