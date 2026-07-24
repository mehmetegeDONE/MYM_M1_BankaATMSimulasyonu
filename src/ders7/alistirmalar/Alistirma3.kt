package ders7.alistirmalar

fun main() {
    /*
    Görev 3: Çift Sayıların Toplamı (Performanslı Çözüm)
1’den 100’e kadar olan sayılar arasında (100 dahil) sadece çift sayıların toplamını bulan bir program yazın.

Mühendislik İpucu: Geleneksel yöntemde 1’den 100’e kadar tüm sayılar dönülür ve içerde if (i % 2 == 0) kontrolü yapılır
 (Bu 100 adım demektir). Ancak siz step 2 anahtar kelimesini kullanarak döngünün sadece çift sayılarda dönmesini
 (2’den başlayarak) sağlayabilir ve işlemi yarı yarıya kısaltarak çok daha performanslı bir kod yazabilirsiniz!
     */

    val birdenYuze = 2..100 step 2
    var sonuc = 0

    for (i in birdenYuze){
        println(i)
        sonuc += i
    }

    println("TOPLAMLARI: $sonuc")
}