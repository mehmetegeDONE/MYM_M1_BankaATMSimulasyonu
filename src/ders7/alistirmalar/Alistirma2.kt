package ders7.alistirmalar

fun main() {
    /*
Kullanıcıdan pozitif bir tam sayı girmesini isteyin.
Gelen veriyi güvenli bir şekilde tam sayıya çevirdikten sonra,
bu sayının faktöriyel değerini hesaplayarak ekrana yazdırın. (Örneğin: 5! = 5 * 4 * 3 * 2 * 1 = 120 gibi.
  Kullanıcı 5 girdiğinde çıktı sadece “5! = 120” olmalıdır. Çarpım aşamalarını yan yana yazdırmanıza gerek yoktur.)

İpucu: Sonucu tutmak için döngü dışında var sonuc = 1 adında bir değişken tanımlayın.
Ardından downTo kullanarak verilen sayıdan 1’e doğru geriye sayan bir döngü kurun ve her adımda sayacı sonuc ile çarparak (*=) güncelleyin.
 */

    print("Lütfen pozitif bir tam sayi girin: ")
    val sayim = readln().toLongOrNull()

    if (sayim != null && sayim > 0){
        var sonuc : Long = 1
        print("$sayim! = ")
        for (i in sayim downTo 1){
            if (i.toInt() != 1) print("$i * ") else print("$i = ")
            sonuc *= i
        }
        print(sonuc)

    } else if (sayim == null){
        println("HATA: Girdiğiniz sayı geçerli değil!")
    } else{
        println("HATA: Girdiğiniz sayı negatif!")
    }
}