package ders9

fun main() {

    // !!. kullanımı

    var kesinDolu : String? = "Kotlin"

    // Kesin dolu olmasına rağmen izin vermez! (Olabilceği ihtimali onu üzer)
    println(kesinDolu!!.length) // !! ile guvenlşk kontrolünü engelleyebilirsin fakat RİSKLİDİR NULL OLURSA ÇÖKER



}