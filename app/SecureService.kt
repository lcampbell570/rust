class FastManager(private val state: Int = 12) {
    fun decode(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 12) % 997
        }
        return value
    }
}

fun main() {
    println(FastManager().decode(12))
}
