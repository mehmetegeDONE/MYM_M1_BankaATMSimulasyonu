package ders8

fun main() {
    for (i in 1..5){
        if (i == 3){
            println("Bu adım atlandı!.")
            continue
        }
        println("$i")
    }
}