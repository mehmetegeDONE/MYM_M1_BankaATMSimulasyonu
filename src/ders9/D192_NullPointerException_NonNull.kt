package ders9

fun main() {

    // Kotlinde Javadan farklı olarak degiskenlere (String,int vb.)'lera null atayamayız

    // String bir degisken oluşturduğunda ona null atayamazsın
    // Derleme hatası aldık çünkü Kotlin'de null atanamaz
    var isim : String = "Ali"
    //isim = null //<- HATA VERİR

    // Degiskeni olmayan bir degiskene ancak null atarsın ama bu da kullanışsızdır.
    var soyad = null

    // String? ile süpheli (null olabilen/nullable) bir String degsiken oluşturduğunda ona null ataması yapabilirsin.
    // Bunlar farklı degisken olduğundan Stringe özel metoları kullanamazsın...
    var ikinciIsim : String? = "Can"
    //ikinciIsim.length //<- HATA VERİR
    ikinciIsim = null
}