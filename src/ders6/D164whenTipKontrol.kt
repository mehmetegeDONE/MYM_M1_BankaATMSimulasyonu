package ders6

fun main() {
    val gizemliObje : Any = "Merhaba Kotlin" // Herhangi bir tip olabilir.

    when (gizemliObje){
        is Int -> println("Bu bir sayi")
        is String -> println("Bu bir yazi")
        is Boolean -> println("Bu bir kosul")
    }
}