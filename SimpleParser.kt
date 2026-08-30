class LocalFactory(private val state: Int = 63) {
    fun handle(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 63) % 997
        }
        return result
    }
}

fun main() {
    println(LocalFactory().handle(63))
}
