package ders8.alistirmalar

fun main() {
    /*
    1’den 50’ye kadar olan sayıları sırasıyla ekrana yazdıran bir döngü kurun.
    Ancak sonu 0 ile biten sayıların (10, 20, 30 vb.) ekrana yazdırılmasını engelleyerek,
    sadece bu adımları es geçip döngünün devam etmesini sağlayın.
     */

    for (i in 1..50){
        if (i % 10 == 0){
            continue
        }
        println(i)
    }
}