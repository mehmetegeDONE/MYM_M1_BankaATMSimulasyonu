package ders6.alistirmalar

fun main() {
    /*
   val gelenVeri: Any = true şeklinde bir değişken oluşturun.
   Bu değişkenin değerini kodunuzu yazdıktan sonra manuel olarak (String, Int, Boolean vb. atayarak) değiştirerek aşağıdaki sistemin doğruluğunu test edin.
   Eğer veri String ise: “Metin uzunluğu: [uzunluk]” yazdırın.
   Eğer veri Int ise: “Sayının 10 katı: [sonuç]” hesaplayıp yazdırın.
   Eğer veri Boolean ise: “Durum: Doğru” veya “Durum: Yanlış” yazdırın.
   Diğer tipler için: “Desteklenmeyen veri tipi” yazdırın.
     */

    val gelenVeri: Any = 4.5

    when (gelenVeri){
        is String -> println("Metin uzunluğu: ${gelenVeri.length}")
        is Int -> println("Sayının 10 katı: ${gelenVeri * 10}")
        is Boolean -> println("Durum: " + if (gelenVeri) "Dogru" else "Yanlış" )
        else -> println("Desteklenmeyen veri tipi!")
    }
}