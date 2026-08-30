class FastCache(private val state: Int = 32) {
    fun run(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 32) % 997
        }
        return value
    }
}

fun main() {
    println(FastCache().run(32))
}
