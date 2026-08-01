package ders9.alistirmalar

fun main() {
    /*
    Kullanıcının adını, soyadını ve yaşını tutacak üç değişken oluşturun.
    Ad bilgisi kesin girilmiş olsun (String), ancak soyad (String?) ve yaş (Int?) değişkenlerine null atayın.
    Ekrana şu formata uygun tek bir string yazdırın: “Merhaba [Ad] [Soyad], Yaşınız: [Yaş]”.
    Yazdırma işlemi sırasında Elvis operatörü kullanarak, null olan alanlar için (soyad yerine ‘(Soyad belirtilmemiş)’, yaş yerine 0) varsayılan değerler atayın.
     */

    val ad : String = "Mehmet"
    val soyad : String? = null
    val yas : Int? = null

    println("Merhaba $ad ${soyad?: "(Soyad belirtilmemiş)"}, Yaşınız: ${yas?: 0}")


}