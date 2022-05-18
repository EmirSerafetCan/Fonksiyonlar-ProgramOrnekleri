fun main(Args: Array<String>) {

    //20'ye kadar olan sayıların toplamı
    /*
    var toplam = 0
    for (i in 1..20){
        toplam += i
    }
    println(toplam)


    //Çarpım Tablosu

    for (x in 1..9){
        for (y in 1..9){
            println("$x x $y = "+x*y)
        }
        println("*************")
    }
    */

    //Sayı Tahmin Oyunu

    var rastgele = (1..10).random()

    var sayac = 1

    while (1==1){
        print("Bir Sayı Giriniz: ")
        var sayi = readLine()!!.toInt()

        if (sayi == rastgele) {
            println("Tebrikler! $sayac. Denemede Bildiniz.")
            break
        }

        else{
            println("Tekrar Deneyiniz.")
        }
        sayac++
    }

}