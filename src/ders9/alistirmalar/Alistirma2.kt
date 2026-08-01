package ders9.alistirmalar

fun main() {
    /*
    Bir kargo şirketinin takip modülünü kodluyorsunuz.
    kargoNo adında nullable bir String değişken oluşturun ve başlangıçta null değerini atayın.
     Bu problemi iki farklı yöntemle çözün:
    Geleneksel Yöntem: Klasik bir if-else kontrolü yazarak,
    kargo numarası varsa “Kargo numaranızın uzunluğu: [X] hanedir”, yoksa “Kargonuz henüz yola çıkmadı.”
    mesajını yazdırın.
    Kotlin Yöntemi (Zarafet): Yukarıda yazdığınız çok satırlı if-else yapısını tamamen ortadan kaldırın.
    Sadece Safe Let (?.let {}) ve Elvis (?:) operatörlerini bir arada kullanarak,
    tüm bu kontrolü ve mesaj atamasını tek bir satırda (if-else kullanmadan) çözün ve sonucu ekrana bastırın.
     */

    val kargoNo : String? = null

    /*
    if (kargoNo == null){
        println("Kargonuz henüz yola çıkmadı.")
    } else{
        println("Kargo numaranızın uzunluğu: ${kargoNo.length} hanedir")
    }
    */

    println(kargoNo?.let {"Kargo numaranızın uzunluğu: ${it.length} hanedir"} ?: "Kargonuz yola çıkmadı")

    // ?. -> null değilse yap (let kullanılabilir)
    // ?: -> null ise yap
}