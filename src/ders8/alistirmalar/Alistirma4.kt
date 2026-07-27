package ders8.alistirmalar

fun main() {

    /*
    Bir okulda 5 sınıf ve her sınıfta 10 öğrenci olduğunu düşünün.
    İç içe döngüler kullanarak tüm sınıfları ve öğrencileri sırasıyla tarayın
    (Örn: “1. Sınıf, 1. Öğrenci”). Sistem 3. sınıfın 5. öğrencisine ulaştığında “Aranan öğrenci bulundu!”
    mesajını vererek her iki döngüyü birden tek bir hamlede tamamen sonlandırın.
     */

    loop@ for (i in 1..5){
        println("-$i. Sınıftakiler-")
        for (j in 1..10){
            println("Ogrenci $j")

            if (i == 3 && j == 5){
                println("Aranan öğrenci bulundu")
                break@loop
            }
        }
    }
}