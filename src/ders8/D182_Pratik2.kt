package ders8

/*
Problem 2 (do-while): “Tekrar Oyna” Onay Ekranı
Geliştirdiğiniz bir oyun bittiğinde, kullanıcının isteğine göre oyunu tekrar başlatacak bir onay mekanizması tasarlayacaksınız:

Kullanıcının kararını tutmak üzere secim adında, başlangıç değeri boş olan metinsel (String) bir değişken tanımlayın.
En az 1 kez kesinlikle çalışacak bir do-while döngüsü kurun.
Döngünün içinde ekrana “Oyun bitti! Tekrar oynamak ister misiniz? (E/H): ” sorusunu yazdırın ve kullanıcının verdiği cevabı (büyük-küçük harf hatalarını önlemek için .lowercase() uygulayarak) secim değişkenine atayın.
Kullanıcı “e” girdiği sürece döngünün başa sarmasını (tekrar oynamasını), “h” veya farklı bir şey girdiğinde ise döngünün sonlanıp ekrana “Uygulama kapatıldı.” yazmasını sağlayın.
 */

fun main() {

    var secim : String

    do {

        println("Oyun bitti tekrar oynamak ister misin? (E/H): ")
        secim = readln().trim().lowercase()


    } while (secim == "e" || secim.equals("evet",true))
}