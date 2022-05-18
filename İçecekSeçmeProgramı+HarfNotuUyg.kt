fun main(Args: Array<String>) {

//Çay-Kahve Seçme Programı


    println("Çay veya Kahve Seçimi Yapınız.")

    print("İlk Arada Ne İçtiniz? : ")
    var icecek1 = readLine()!!.toString()
    if (icecek1 != "kahve" && icecek1 != "çay") return println("Yanlış Seçim Yaptınız. Lütfen Çay veya Kahve Seçimi Yapınız.")

    print("İkinci Arada Ne İçtiniz? : ")
    var icecek2 = readLine()!!.toString()
    if (icecek2 != "kahve" && icecek2 != "çay") return println("Yanlış Seçim Yaptınız. Lütfen Çay veya Kahve Seçimi Yapınız.")

    if (icecek1 == "kahve" && icecek2 == "kahve") {
        println("Sağlığınız İçin Üçüncü Arada Kahve İçmenizi Önermeyiz")
    }

    print("Üçüncü Arada Ne İçtiniz? : ")
    var icecek3 = readLine()!!.toString()
    if (icecek3 != "kahve" && icecek3 != "çay") return println("Yanlış Seçim Yaptınız. Lütfen Çay veya Kahve Seçimi Yapınız.")

    println("$icecek3 hazırlanıyor.")

/*

    //Harf Notu Uygulaması

    val not = "CB"
    val sonuc = when(not){

        "AA" -> "Harf Notunuz AA'dır"
        "BA" -> "Harf Notunuz BA'dır"
        "BB" -> "Harf Notunuz BB'dir"
        "CB" -> "Harf Notunuz CB'dir"
        "CC" -> "Harf Notunuz CC'dir"
        "DD" -> "Harf Notunuz DD'dir"
        else -> "Harf Notunuz DD'dir"
    }
    println(sonuc)
*/

}