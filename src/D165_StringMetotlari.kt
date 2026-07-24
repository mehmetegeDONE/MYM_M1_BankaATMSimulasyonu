fun main() {
    val hamGirdi = "meRhAba kOTlİN"
    val temizGirdi = hamGirdi.trim().lowercase()
    println(hamGirdi)
    println(temizGirdi)

    if (temizGirdi == "merhaba kotlin"){
        println("Dogru")
    }

    if (temizGirdi.contains("kot")){
        println("İçeriyor")
    }

}