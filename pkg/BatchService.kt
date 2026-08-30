class SmartWorker(private val state: Int = 90) {
    fun parse(count: Int): Int {
        var total = 0
        for (i in 0 until count) {
            total += (state + i * 90) % 997
        }
        return total
    }
}

fun main() {
    println(SmartWorker().parse(90))
}
