package ders6.alistirmalar

fun main() {
    /*
 Kullanıcıdan konsol aracılığıyla 1 ile 12 arasında bir ay numarası girmesini isteyin.
 Gelen veriyi çökme riski taşımayacak şekilde güvenli bir şekilde tam sayıya çevirin (geçersiz veri durumunda hata mesajı vererek programın çökmesini önleyin).
 Girilen ay numarasına göre ayın hangi mevsime ait olduğunu when yapısını bir ifade (expression) olarak kullanarak doğrudan bir değişkene atayın ve ekrana yazdırın.
12, 1, 2 -> Kış
3, 4, 5 -> İlkbahar
6, 7, 8 -> Yaz
9, 10, 11 -> Sonbahar
Diğer tüm geçersiz sayılar için hata mesajı üretin.
Görev 2: Güvenli Kargo Ücreti Hesaplayıcı
     */

    print("Lütfen 1 ve 2 arasında bir ay numarası girin: ")
    val ayNumarasi = readln().toIntOrNull()

    if (ayNumarasi != null  && ayNumarasi <= 12 && ayNumarasi >= 1){
        val meysim = when(ayNumarasi){

            12,1,2 -> "Kış"
            3,4,5 -> "İlkbahar"
            6,7,8 -> "Yaz"
            9,10,11 -> "Sonbahar"
            else -> "HATALI AY"
        }

        println(meysim)
    } else{
        println("HATA: Lütfen geçerli bir sayı girin! (1-12 arasında)")
    }

}