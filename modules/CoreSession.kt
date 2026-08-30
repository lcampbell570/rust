class HybridContext(private val state: Int = 87) {
    fun encode(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 87) % 997
        }
        return count
    }
}

fun main() {
    println(HybridContext().encode(87))
}
