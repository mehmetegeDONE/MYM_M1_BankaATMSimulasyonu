package ders6.alistirmalar

fun main() {
    /*
    Kullanıcıdan müze ziyareti için yaşını girmesini isteyin.
    Girdiyi çökme riski taşımayacak şekilde güvenli bir tam sayıya çevirin (harf girilirse hata mesajı verin).
     Yaş değerine göre bilet kategorisini ve fiyatını when yapısını bir ifade (expression) olarak kullanarak bir değişkene atayın ve en sonda ekrana yazdırın.

0 – 6 yaş arası -> “Ücretsiz Tarife: 0 TL”
7 – 18 yaş arası -> “Öğrenci Tarifesi: 50 TL”
19 – 64 yaş arası -> “Tam Tarife: 100 TL”
65 ile 120 yaş arası -> “Emekli İndirimi: 40 TL”
Bu sınırlar dışındaki tüm sayılar için geçersiz yaş uyarısı verin.
     */

    print("Lütfen yaşınızı girin: ")
    val yas = readln().toIntOrNull()


    if (yas != null){
        val tarifem : String

        when(yas){
            in 0.. 6 -> tarifem = "Ücretsiz Tarife: 0 TL"
            in 7.. 18 -> tarifem = "Öğrenci Tarifesi: 50 TL"
            in 19.. 64 -> tarifem = "Tam Tarife: 100 TL"
            in 65.. 120 -> tarifem = "Emekli İndirimi: 40 TL"
            else -> tarifem = "GEÇERSİZ YAŞ"
        }

        println(tarifem)
    }
}