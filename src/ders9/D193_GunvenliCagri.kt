package ders9

fun main() {

    // ?. -> null degilse yap

    var ikinciIsim : String? = "Can" // Nullable tip
    println(ikinciIsim?.length) // Null değilse yapacaktır (Burada null değil o yüzden degiskenin uzunluğunu yazacak)
    ikinciIsim = null
    println(ikinciIsim?.length)  // Burada null o yüzden "null" yazacak


    // Açılımı
    if (ikinciIsim != null){
        println(ikinciIsim.length)
    } else{
        println(null)
    }
}