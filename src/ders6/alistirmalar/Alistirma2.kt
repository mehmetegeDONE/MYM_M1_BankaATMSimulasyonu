package ders6.alistirmalar

fun main() {
    /*
    Kullanıcıdan sepetindeki toplam tutarı (ondalıklı sayı olarak) girmesini isteyin.
    Girdiyi çökme riski taşımayacak şekilde güvenli bir şekilde ondalıklı sayıya dönüştürün
    (geçersiz veri girilirse programın çökmesini engelleyip uyarı verin).
     Gelen tutara göre kargo ücretini hesaplayan ve toplam ödenecek miktarı (sepet + kargo)
     ekrana yazdıran bir when yapısı kurun.

0 – 99.99 TL arası -> Kargo 30 TL
100.0 – 299.99 TL arası -> Kargo 15 TL
300.0 TL ve üzeri -> Kargo Bedava!
Sıfırın altındaki negatif değerler için uyarı verin.
     */


    print("Lütfen sepet tutarınızı giriniz: ")
    val sepetTutari = readln().toDoubleOrNull()

    if (sepetTutari != null){
        var kargoUcreti: Double
        when(sepetTutari){
            in 0.0..99.9 -> {
               kargoUcreti = 30.0
               println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }
            in 100.0.. 299.9 -> {
                kargoUcreti = 15.0
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }
            in 300.0..Double.MAX_VALUE -> {
                kargoUcreti = 0.0
                println("Kargo ücreti $kargoUcreti. Toplam ödenecek tutar: ${sepetTutari + kargoUcreti} TL")
            }
            else -> println("HATA: Sepet değeri negatif olamaz!")
        }
    } else{
        println("Sepet tutarını hatalı girdiniz!")
    }
}