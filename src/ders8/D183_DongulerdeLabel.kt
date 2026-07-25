package ders8

fun main() {

    loop@ for (i in 1.. 3){
        println("Dış Döngü Değeri: $i")

        for (j in 1..3){
            println("İç Döngü Değeri : $j")

            if (i == 2 && j == 2){
                break@loop
            }
        }
    }
}