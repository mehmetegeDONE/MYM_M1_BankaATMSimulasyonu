package ders7

fun main() {
    // İki Nokta (..)
    val birdenBese = 1.. 5  // 1'den 5'e kadar
    println(birdenBese)

    val adanzye = 'a'.. 'z' // a'dan z'ye kadar (sadece ingilizce-latin harfler)
    println(adanzye)

    // until
    val birdenDorde = 1 until 5 // 1,2,3,4 verir (5 dahil değil)

    // downTo
    val ondanBire = 10 downTo 1 // 10,9,8,7,6,5,4,3,2,1

    // step
    val tekSayilar = 1..10 step 2 // 1, 3, 5, 7, 9 Yazılan step kadar (2) ardaşık ekleyerek gider

    // in
    val yas = 25

    if (yas in 18.. 65){ // Boollarda koşul belirtirken kullanılır ("!in" ile olumsuzluk katıp da kullanılabilir)
        println("Çalışma çağındasınız!")
    }
}
