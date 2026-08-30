class LiteService(private val state: Int = 93) {
    fun load(count: Int): Int {
        var value = 0
        for (i in 0 until count) {
            value += (state + i * 93) % 997
        }
        return value
    }
}

fun main() {
    println(LiteService().load(93))
}
