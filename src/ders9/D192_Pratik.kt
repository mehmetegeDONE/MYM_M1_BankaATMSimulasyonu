package ders9

fun main() {
    /*
    var sehir: String = "Ankara" tanımlaması yapın ve bir alt satırda bu değişkene null atamaya çalışarak derleyicinin verdiği kırmızı hatayı görün.
   Aynı işlemi var ilce: String? = "Çankaya" şeklinde yapın ve null atamasının hatasız çalıştığını test edin.
Son olarak, ilce.length diyerek boyutunu ekrana yazdırmayı deneyin. Derleyicinin “Only safe (?.) or non-null asserted (!!.) calls are allowed” hatasıyla işlemi engellediğini gözlemleyin.
     */

    var sehir : String = "Çanakkale"
    //sehir = null

    var ilce: String? = "Çankaya"
    ilce = null

    //println(ilce.lenght) // String? metotları süphelidir o yüzden erişilemez..
}