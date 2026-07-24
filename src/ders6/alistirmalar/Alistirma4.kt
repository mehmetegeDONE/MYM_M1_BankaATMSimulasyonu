package ders6.alistirmalar

fun main() {
    /*
Kullanıcıdan readln() ile bir metin alın.
Kullanıcının metnin sağına soluna yanlışlıkla boşluk bırakabileceğini ve büyük/küçük harf karışık yazabileceğini hesaba katarak metni önce temizleyin.
Temizlenmiş metin üzerinden parametresiz bir when yapısıyla şu kontrolleri yapın:

Girilen komut tam olarak “merhaba” ise: “Size de merhaba!” yazdırın.
Girilen komut tam olarak “saat kaç” ise: “Şu an saat 14:00” yazdırın.
Eğer komutun içinde “hava” kelimesi geçiyorsa: “Dışarıda harika bir hava var.” yazdırın.
Hiçbiri eşleşmezse: “Ne demek istediğinizi anlayamadım.” yazdırın.
     */

    print("Merhaba ben CHATBOT! Size nasıl yardımcı olabilirim?: ")
    val kullaniciCevabi = readln().trim().lowercase()

    when{
        kullaniciCevabi == "merhaba" -> {
            println("Sana da merhaba!")
        }
        kullaniciCevabi == "saat kaç" -> {
            println("Saat 4")
        }
        kullaniciCevabi.contains("hava") -> {
            println("Dışarıda harika bir hava var!")
        }
        else -> println("Ne demek istediğinizi anlayamadım.")
    }


}