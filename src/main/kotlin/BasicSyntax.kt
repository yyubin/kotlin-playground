import java.lang.Integer.parseInt

fun main() {
    // String templates
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    // Conditional expressions
    fun maxOf(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    // same
    fun maxOf2(a: Int, b: Int) = if (a > b) a else b


    // for loop
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    // while loop
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    // when expression
    fun describe(obj: Any): String =
        when (obj) {
            1   -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is Long -> "Not a string"
            else -> "Unknown"
    }

    println(describe(1)) // One
    println(describe("Hello")) // Greeting
    println(describe("yubin")) // Not a string

    // Ranges
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in 0..list.lastIndex) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
    println()

    // Collections
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }


    // null check
    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)

        // Using `x * y` yields error because they may hold nulls.
        if (x != null) {
            println(x * y)
        }
        else {
            println("'$arg1' or '$arg2' is not a number")
        }
    }

    printProduct("3", "4") // 12


    // type check, automatic casts
    fun getStringLength(obj: Any): Int? {
        if (obj !is String) return null

        return obj.length
    }
    println(getStringLength("ABCDEFG")) // 7


}