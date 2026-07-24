package ders7.alistirmalar

import kotlin.io.println

fun main() {
    /*
    Bir önceki derste öğrendiğiniz String metotlarını for döngüsü ile birleştirerek basit bir mesaj denetim sistemi yazacaksınız.

1’den 5’e kadar dönen bir for döngüsü kurun (Kullanıcıya 5 mesaj atma hakkı veriyoruz).
Döngünün her adımında kullanıcıdan readln() ile bir mesaj girmesini isteyin.
Girilen metni, karar mekanizmasına sokmadan önce boşluklarından arındırın (trim) ve tamamen küçük harfe (lowercase) çevirin.
Eğer temizlenmiş metnin içinde “bedava”, “kazandınız” veya “kampanya” kelimelerinden herhangi biri geçiyorsa (contains veya == kullanarak)
ekrana “Spam mesaj engellendi!” yazdırın.
Geçmiyorsa “Mesaj gönderildi: [Temizlenen Mesaj]” yazdırın.
     */

    for (i in 5 downTo 1){
        println("Hak : " + i)
        print("Bir mesaj girin: ")
        val mesaj = readln().trim().lowercase()

        val spamMesajlar = (
                mesaj.contains("bedava",true) || // Ignore case true yapabilirsin
                mesaj.contains("kazandınız",true) ||
                mesaj.contains("kampanya",true))

        if (spamMesajlar){
            println("SPAM MESAJ ENGELLENDİ")
        }else{
            mesajYollandi()
        }
        when(i){ 1 -> println("HAKKIN BİTTİ") }
    }
}

fun mesajYollandi (){
    println("Mesaj gönderildi")
}