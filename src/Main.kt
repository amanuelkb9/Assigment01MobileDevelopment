
fun main() {
    // 3.a
    println("3.a")
    PrintNumber(12345)
    println("-----------------------")

    // 3.b
    val arr = intArrayOf(1, 2,3,4,5,6)
    println("3.b")
    println(sumOddSquared(arr))
    println("-----------------------")

    // 3.c
    val inputWeight = (readlnOrNull() ?: "0").toInt()
    println("3.c")
    println(calculateWeightAll("Uranus", inputWeight))
}

fun PrintNumber(number: Int) {
    val str = number.toString()
    print(str.first())
    println(str.last())
}

fun sumOddSquared(list: IntArray): Int {
    var result = 0
    list.forEach { item ->
        if (item % 2 != 0) {
            result += item * item
        }
    }
    return result
}

fun calculateWeightAll(planet: String, inputWeight: Int) : Double {
    return when (planet) {
        "Venus" -> inputWeight * 0.78
        "Mars" -> inputWeight * 0.39
        "Jupiter" -> inputWeight * 2.65
        "Saturn" -> inputWeight * 1.17
        "Uranus" -> inputWeight * 1.05
        else -> inputWeight * 1.23
    }
}