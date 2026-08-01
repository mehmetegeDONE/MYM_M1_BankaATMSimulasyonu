package ders9.alistirmalar

fun main() {
    /*
    Kullanıcıdan readln().toIntOrNull() kullanarak doğum yılını alın.
    Eğer kullanıcı harf girerse (yani sonuç null çıkarsa) sistem çökmek yerine Elvis operatörünü devreye soksun
    ve doğum yılını varsayılan olarak bulunduğumuz yıl kabul etsin.
    Sonuç olarak kullanıcının hesaplanan yaşını ekrana yazdırın.
     */

    print("Lütfen dogum yılınızı girin: ")
    val dogumYili = readln().toIntOrNull() ?: 2026

    println(dogumYili)



}