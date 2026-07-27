package ders8.alistirmalar

fun main() {
    /*
    Programınız sürekli olarak rastgele bir zar atsın (1 ile 6 arası) ve her atışta
    “Zar: X geldi, tekrar atılıyor…” mesajını yazdırsın.
     Zar 6 geldiğinde “Şanslı altı geldi! Oyun bitiyor.” mesajını vererek zar atma işlemini tamamen durdurun.
     */

    var randomSayi : Int

    loop@ do {
       randomSayi = (1..6).random()
       when (randomSayi) {
           6 -> {
               println("Şanslı altı geldi! Oyun bitiyor.")
               break@loop
           }
           else -> println("Zar: $randomSayi geldi, tekrar atılıyor…")
       }
    } while (true)


}