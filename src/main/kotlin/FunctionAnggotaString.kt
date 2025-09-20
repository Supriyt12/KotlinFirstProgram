fun main(args: Array<String>) {
    val s = "Rhinopotamus"

    // Mengecek apakah string s dimulai dengan "rhin"
    println(s.startsWith("rhin")) // false karena huruf 'R' besar

    // Mengecek apakah string s diakhiri dengan "tamus"
    println(s.endsWith("tamus"))  // true

    // Mengecek apakah string s mengandung "pot"
    println(s.contains("pot"))    // true

    // Mengecek apakah string s mengandung "lol"
    println(s.contains("lol"))    // false

    // --- toUpperCase() dan toLowerCase() ---

    var config = "Fullscreen shaDows autosave"

    // Ubah semua huruf dalam string jadi huruf kecil
    config = config.toLowerCase()

    println("Will the game run in fullscreen?")
    // Mengecek apakah string config mengandung kata "Fullscreen" (case-sensitive)
    println(config.contains("Fullscreen")) // false

    // Mengecek apakah string config mengandung kata "fullscreen"
    println(config.contains("fullscreen")) // true

    println("Will shadows be turned on?")
    // Mengecek apakah config mengandung kata "shadows"
    println(config.contains("shadows"))    // true

    println("Will sound be turned off?")
    // Mengecek apakah config mengandung kata "nosound"
    println(config.contains("nosound"))    // false

    println("Would the player like to use autosave?")
    // Mengecek apakah config mengandung kata "autosave"
    println(config.contains("autosave"))   // true

    // --- replace() ---

    var strJava = "Java is the best!"
    // Ganti kata "Java" menjadi "Kontlin"
    strJava = strJava.replace("Java", "Kontlin")

    // Menampilkan string s yang lama (Rhinopotamus)
    println(s)

    // Menampilkan string baru beserta panjang karakternya
    println("$strJava is ${strJava.length} characters long.")

    // --- substring() ---
    // Contoh mengambil potongan string dari index 2 sampai 7
    println("I would not banish all of these Internets.\".substring(2, 7)")

    // --- compareTo() ---
    // Membandingkan string "alpha" dengan "Bravo" secara leksikografis
    println("alpha".compareTo("Bravo"))
}
