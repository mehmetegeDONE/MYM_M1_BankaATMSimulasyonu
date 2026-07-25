package ders8

fun main() {
    var sayac = 1

    do {
        println("Sayac Değeri: $sayac")
    } while (sayac < 1)

    println("Program sonlandırıldı.")


    //Şifre kontrol örneği

    var sifre: String
    var hak = 3

    do {
        print("Şirenizi girin: ")
        sifre = readln()

        if (sifre != "12345") println("Yanlış şifre")
        hak--

        for (i in 1..5){
            Thread.sleep(100)
            print(".")
        }
        println()
    } while (sifre != "12345" && hak in 1..3)

    if (hak > 0){
        println("Hoşgeldiniz!")
    } else println("Hesabınız kilitlendi!")


}