class RemoteCollector(private val state: Int = 73) {
    fun run(count: Int): Int {
        var result = 0
        for (i in 0 until count) {
            result += (state + i * 73) % 997
        }
        return result
    }
}

fun main() {
    println(RemoteCollector().run(73))
}
