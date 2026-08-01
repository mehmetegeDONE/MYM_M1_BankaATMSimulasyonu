package ders10

import kotlin.io.println

fun main() {
    var hak = 3
    val sifre = "1234"
    var secim : Int?
    var bakiye = 1000.0

    do {
        print("Şifrenizi giriniz: ")
        val kullaniciSifreGirdi = readln().trim()

        if (kullaniciSifreGirdi != sifre){
            hak--
            when{
                hak <= 0 -> {
                    println("Kartınız bloke olmuştur!")
                    return}
                else -> println("Şifreyi hatalı girdiniz! Kalan giriş hakkınız: $hak")
            }
        }
    } while (kullaniciSifreGirdi != sifre)

    do {

        println()
        println("""
         1. Bakiye Sorgulama |
         2. Para Yatırma     |
         3. Para Çekme       |
         4. Çıkış            |
    """.trimIndent())

        print("Seçiminiz: ")
        secim = readln().toIntOrNull()

        when{
            secim == 1 -> {
                println("Bakiye sorgulanıyor")
                waitForMe()
                println("Mecvut bakiyenizde $bakiye TL bulunmaktadır")
            }
            secim == 2 -> {
                print("Yatırmak istediğiniz tutarı girin: ")
                val yatirmakIstenenTutar = readln().toDoubleOrNull()

                if (yatirmakIstenenTutar != null) {
                    if (yatirmakIstenenTutar < 0){
                        println("Yatırmak istediğin tutar negatif olamaz")
                    } else if (yatirmakIstenenTutar == 0.0){
                        println("Yatırmak istediğin tutar sıfıra eşit olamaz")
                    } else {
                        println("Hesabınıza tutar yatırılıyor")
                        bakiye += yatirmakIstenenTutar.toDouble()
                        waitForMe()
                        println("Hesabınıza $yatirmakIstenenTutar Tl para yatırıldı. Yeni bakiyeniz : $bakiye")
                    }
                } else println("Girdiniz harf değil, sayı ile olmalı!")
            }
            secim == 3 -> {
                print("Çekeneceğin tutarı girin: ")
                val cekilecekIstenenTutar = readln().toDoubleOrNull()

                if (cekilecekIstenenTutar != null) {
                    if (cekilecekIstenenTutar > bakiye){
                        println("Çekeceğiniz tutar bakiyenizden fazla!")
                    } else if (cekilecekIstenenTutar == 0.0){
                        println("Çekilecek tutar sıfır olamaz!")
                    } else if (cekilecekIstenenTutar < 0) {
                        println("Çekilecek tutar negatif olamaz!")
                    } else {
                        println("Para çekiliyor")
                        bakiye -= cekilecekIstenenTutar
                        waitForMe()
                        println("Paranız ${cekilecekIstenenTutar}'ı kadarı çekilmiştir. Yeni bakiyeniz $bakiye")
                    }
                } else println("Girdiniz harf değil, sayı ile olmalı!")
            }
            else -> {
                if (secim != 4){
                    println("Girilen numara (1-4) arasında olmalıydı. Hatalı giriş yapmamak için lütfen bu aralıkta bir sayi girin.")
                }
            }
        }

    } while (secim != 4)

    println("Sistemden çıktınız. İyi günler dileriz.")

}

fun waitForMe(){
    for (i in 1..3){
        Thread.sleep(1000)
        print(".")
    }
    println()
}