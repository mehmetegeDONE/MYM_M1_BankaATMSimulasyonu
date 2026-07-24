package ders7

fun main() {

    // in ve (..) yöntemi ile fori

    for (i in 1..5){
        println(i)
    }

    for (harf in 'a'.. 'z'){
        print(harf)
    }
    println()

    // in ve until yöntemi ile fori

    for (i in 1 until 5){ // (5 dahil değil)
        println(i)
    }

    for (i in 10 downTo 1 step 2){
        println(i)
    }
}