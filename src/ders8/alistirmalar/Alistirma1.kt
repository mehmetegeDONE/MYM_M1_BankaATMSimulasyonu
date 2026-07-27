package ders8.alistirmalar

fun main() {
    /*
    Sistemde kayıtlı doğru şifrenin “1234” olduğunu varsayın.
    Kullanıcı doğru şifreyi girene kadar sürekli
    “Lütfen şifrenizi girin:” diye soran bir simülasyon yazın. Doğru şifre girildiğinde “Giriş Başarılı” mesajı vererek programı sonlandırın.
     */

    val sifre = "1234"
    var kullaniciGirdisi : Any

    do {
        print("Şifre girin: ")
        kullaniciGirdisi = readln()


    } while (kullaniciGirdisi != sifre)

    println("Hoşgeldiniz...")
}