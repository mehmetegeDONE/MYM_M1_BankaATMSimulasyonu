package ders6

fun main() {
    val gun = 3

    when (gun){
        1, 2, 3, 4, 5 -> println("Hafta içi")
        6, 7 -> println("Hafta sonu")
    }

    println(gun)
}