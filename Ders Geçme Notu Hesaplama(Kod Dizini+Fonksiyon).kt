fun main(Args: Array<String>) {

//Öğrencinin Derste Geçip Geçmediğini Kontrol Eden Program

derstenGecmeNotuHesaplama(50,50,0)

/*
    print("1. Vize Notunuzu Giriniz:")
    var birinciVize = readLine()!!.toInt()
    if (birinciVize > 100 || birinciVize < 0) return println("Geçersiz Not Girişi. Lütfen başa dönerek 0 ile 100 arasında not giriniz.")

    print("2. Vize Notunuzu Giriniz.")
    var ikinciVize = readLine()!!.toInt()
    if (ikinciVize > 100 || ikinciVize < 0) return println("Geçersiz Not Girişi. Lütfen başa dönerek 0 ile 100 arasında not giriniz.")

    print("Final Notunuzu Giriniz.")
    var final = readLine()!!.toInt()
    if (final > 100 || final < 0) return println("Geçersiz Not Girişi. Lütfen başa dönerek 0 ile 100 arasında not giriniz.")

    var gecmeNotu = 60

    if (((birinciVize*0.2)+(ikinciVize*0.2)+(final*0.6)) > gecmeNotu) {
        println("Tebrikler! Dersten Geçtiniz.")
    }
    else {
        println("Dersten Kaldınız.")
    }

    var ortalama = (birinciVize*0.2)+(ikinciVize*0.2)+(final*0.6)
    println("Ortalamanız: " +ortalama)
*/
}

fun derstenGecmeNotuHesaplama(vize1:Int, vize2:Int, final:Int) {

    if (vize1 > 100 || vize1 < 0 || vize2 > 100 || vize2 < 0 || final > 100 || final < 0)
        return println("Geçersiz Not Girişi. Lütfen başa dönerek 0 ile 100 arasında not giriniz.")

    if (((vize1 * 0.2)+(vize2 * 0.2)+(final * 0.6)) > 60) println("Dersten Geçtiniz.") else println("Dersten Kaldınız.")

    var ortalama = (vize1*0.2)+(vize2*0.2)+(final*0.6)
    println("Ortalamanız: " +ortalama)

}