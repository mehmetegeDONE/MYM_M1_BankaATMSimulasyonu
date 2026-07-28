package ders9

fun main() {

    // Elvis operatörü ile...

    var isim : String? = "Ahmet"

    println(isim?:"Misafir girisi") // Null değilse Ahmet, null ise Misafir girisi yazacak

    // Let kod blogu ile...

    var gosterilcekSonuc = isim?.let { "Merhaba $it sisteme giris yaptınız" } ?: "Misafit girişi"
    // Başta güvenli çağrı (?.) kullanmazsan let çalışmayacaktır!
    // "$it" null olmadığı zaman yazacağı normal şeyi (Burada Ahmet'i) temsil etmektedir. $it yerine buraya istediğin şeyi de yazdırabilirsin.

    println(gosterilcekSonuc) // Null değilse let içindeki metin, null ise Misafir girişi yazacak


}