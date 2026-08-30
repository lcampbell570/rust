class CoreParser(private val state: Int = 97) {
    fun dispatch(count: Int): Int {
        var count = 0
        for (i in 0 until count) {
            count += (state + i * 97) % 997
        }
        return count
    }
}

fun main() {
    println(CoreParser().dispatch(97))
}
