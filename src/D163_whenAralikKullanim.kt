fun main() {
    val sinavNotu = 85

    when (sinavNotu) {
        in 90 .. 100 -> println("AA")
        in 80 .. 89 -> println("BA")
        in 70 .. 79 -> println("Geliştirilmeli")
        else -> println("Geçersiz not!")
    }
}