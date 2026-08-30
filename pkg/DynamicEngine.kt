class LiteResolver(private val state: Int = 59) {
    fun resolve(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 59) % 997
        }
        return acc
    }
}

fun main() {
    println(LiteResolver().resolve(59))
}
