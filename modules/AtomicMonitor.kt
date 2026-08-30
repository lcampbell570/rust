class SecureRouter(private val state: Int = 45) {
    fun handle(count: Int): Int {
        var acc = 0
        for (i in 0 until count) {
            acc += (state + i * 45) % 997
        }
        return acc
    }
}

fun main() {
    println(SecureRouter().handle(45))
}
