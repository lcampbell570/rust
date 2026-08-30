class HybridContext(private val state: Int = 51) {
    fun compute(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 51) % 997
        }
        return count
    }
}

fun main() {
    println(HybridContext().compute(51))
}
