package ders7

fun main() {
    /*
    Döngülere geçmeden önce, bir değerin sınırların içinde kalıp kalmadığını (in ve !in operatörleri) test edelim. Bir müzik çaların ses seviyesi denetimini kodlayın:

Mevcut ses seviyesini tutan val sesSeviyesi = 105 adında bir değişken oluşturun.
Bir if bloğu açın ve !in (içinde değilse) operatörünü kullanarak bu değerin 0..100 aralığının dışında olup olmadığını kontrol edin. Eğer dışındaysa ekrana “Hata: Ses seviyesi sadece 0 ile 100 arasında olabilir!” uyarısını yazdırın.
else bloğunda ise “Ses seviyesi başarıyla ayarlandı.” mesajını gösterin.
Değişkeninize sırasıyla -5, 50 ve 100 değerlerini atayıp çalıştırarak, aralık kontrolünüzün (özellikle 100’ün dahil olup olmadığının) doğru çalışıp çalışmadığını test edin.
     */

    val sesSeviyesi = 105

    if (sesSeviyesi !in 0..100){
        println("HATA: 0 ile 100 arasında olabilir!")
    } else {
        println("Ses seviyesi başarıyla ayarlandı")
    }
}