package ders8

fun main() {
    var sayac = 1

    while (sayac <= 5){
        println("Zamanlayıcı: " + sayac)
        Thread.sleep(1000)
        sayac++
    }

    println("Zaman Doldu")
}