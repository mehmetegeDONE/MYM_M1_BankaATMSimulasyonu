
fun main() {
    val biletSinifi = 'B'
    val sinifAciklamasi = when (biletSinifi) {
        'E' -> "Ekonomi Sınıfı"
        'B' -> "Business Class"
        'F' -> "First Class"
        else -> "Bilinmeyen Bilet Sınıfı!"
    }
    println("Uçuş Sınıfınız: $sinifAciklamasi")
    // Çıktı: Uçuş Sınıfınız: Business Class
}