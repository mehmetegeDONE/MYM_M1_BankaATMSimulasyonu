fun main() {

    val kullaniciAdi = "admin"
    val sifre = "1234"

    when {
        kullaniciAdi == "" -> println("HATA: kullanici adi boş bırakılamaz!")
        sifre == "" -> println("HATA: sifre alanı boş bırakılamaz")
        kullaniciAdi == "admin" && sifre == "1234" -> println("Giris başarılı!")
        else -> println("Girilen kullanıcı adi veya şifre yanlış!")
    }
}