class LiteHandler(private val state: Int = 92) {
    fun render(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 92) % 997
        }
        return acc
    }
}

fun main() {
    println(LiteHandler().render(92))
}
