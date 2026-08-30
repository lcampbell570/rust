class HybridHandler(private val state: Int = 46) {
    fun encode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 46) % 997
        }
        return value
    }
}

fun main() {
    println(HybridHandler().encode(46))
}
