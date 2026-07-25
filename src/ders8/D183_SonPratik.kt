package ders8

fun main() {
    /*
    1..30 arasında dönen bir for döngüsü kurun.
    Eğer sayı 5’in katı ise (i % 5 == 0), continue kullanarak bu sayıyı yazdırmadan atlayın.
    Eğer sayı 22’ye ulaşırsa, break kullanarak döngüyü tamamen bitirin.
    Diğer tüm durumlarda sayıyı ekrana yazdırın.
     */

    for (i in 1.. 30){
        if (i % 5 == 0){
            continue
        }

        if (i == 22){
            break
        }

        when{
            i == 21 -> print("$i")
            else -> print("$i ")
        }
    }
}