package ders9

fun main() {

    // ?: -> null ise yap

    var kullaniciAdi: String? = null

    var gosterilcekIsim = kullaniciAdi?: "Misafir" // Null ise yap

    println("Merhaba $gosterilcekIsim")


    // hem ?. hem ?:

    var mesaj : String? = null

    println(mesaj?.length?:"bilinmiyor") // Mesaj null ise lenght uygula ve ata, değilse "bilinmiyor" ata (Null check yapan İf-else gibi)


    // Veri alarak örneği
    print("Yaşını gir: ")
    var yas = readln().toIntOrNull()?:"Belirsiz"
    println("Yaşınız: $yas")
}