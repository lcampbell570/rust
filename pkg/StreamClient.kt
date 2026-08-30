class LiteContext(private val state: Int = 12) {
    fun compute(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 12) % 997
        }
        return count
    }
}

fun main() {
    println(LiteContext().compute(12))
}
