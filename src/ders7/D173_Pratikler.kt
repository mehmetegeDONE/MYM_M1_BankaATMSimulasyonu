package ders7

fun main() {
    /*
    Problem 1:
    Bir e-ticaret uygulamasındaki kredi kartı son kullanma yılı seçimi için konsola yılları bastıran bir kod yazacaksınız.
    for döngüsünü kullanarak, bulunduğumuz yıl olan 2026‘dan başlayarak, 2036 yılı hariç olmak üzere önümüzdeki yılları alt alta ekrana yazdırın.
     */

    println("Kredi kartı kullanım yılları:")
    for (yil in 2026 until 2036){
        print("" + yil + " ")
    }
    println()
    println()

    /*
    Problem 2: Bir sistem geri sayım arayüzü tasarlıyorsunuz.
     20 sayısından başlayıp 0‘a kadar (0 dahil) ikişer ikişer geriye doğru azalan sayıları yan yana konsola yazdıran bir döngü kurun.
     */

    println("Geri sayım:")
    for ( zaman in 20 downTo 0 step 2){
        print("" + zaman + " ")
    }
    println()
    println()
    /*
    Problem 3: Alfabe sıralama aracı için, 'a' harfinden başlayıp 'f' harfine kadar (f dahil) olan tüm harfleri sırayla yan yana ekrana bastıran bir döngü yazın.
     */

    println("Alfabedeki harfler: ")
    for ( harf in 'a'..'z'){
        print("" + harf + "")
    }
    println()
    println()

    println("Türkçe harfler:")
    val turkceAlfabe = "abcçdefgğhıijklmnoöpsştuüvyz"
    for (harf in turkceAlfabe){ // tüm indexleri tek tek yazdırır
        print(harf)
    }
    println()
    println()

    // Kullanıcıdan veri alırken for döngüsü kullanma
    for (i in 1..3){
        print("$i. ismi girin: ")
        val isim = readln()
        println(isim)
        println("$i. ismin $isim")
    }

    for (i in 1.. 3){
        print("$i. sayıyı girin: ")
        val sayi = readln().toInt()
        println("$sayi sayisinin karesi -> ${sayi * sayi}")
    }

}