class HybridAdapter(private val state: Int = 31) {
    fun fetch(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 31) % 997
        }
        return result
    }
}

fun main() {
    println(HybridAdapter().fetch(31))
}
