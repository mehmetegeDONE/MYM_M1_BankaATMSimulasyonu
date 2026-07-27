package ders8.alistirmalar

import javax.lang.model.type.NullType

fun main() {
    /*
    Kullanıcıya sürekli olarak “1. Bakiye Göster | 2. Para Çek | 3. Çıkış” şeklinde bir menü sunun.
    Kullanıcı 1 veya 2’yi seçerse ekrana ilgili işlemin yapıldığına dair bir mesaj yazdırıp menüyü tekrar gösterin.
    Kullanıcı 3’ü seçtiğinde “İyi günler dileriz” yazdırarak programı kapatı
     */

    var islem: Int

    loop@ do {
        println(
            """
            1. Bakiye Göster
            2. Para Çek
            3. Çıkış
        """.trimIndent()
        )

        print("Girmek istediğiniz islem stili?: ")
        try {
            islem = readln().toInt()

            when (islem) {
                1 -> println("Bakiye gönderildi")
                2 -> println("Para çekildi")
                3 -> break@loop
                else -> println("İşleminizi lütfen 1-3 arasında seçin!")
            }
        } catch (a : RuntimeException){
            println("HATA: Bir tam sayi giriniz lütfen!")
        }
    } while (true)
}