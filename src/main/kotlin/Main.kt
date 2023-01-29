fun main(args: Array<String>) {
    print("Hello ")
    print("World!")

    println()
    println(sum(4, 10))
    println(anotherSum(10, 50))

    printSum(100, 20)

    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    println("a = $a, b = $b, c = $c")

    var x = 5
    x += 1
    println("x = $x")


}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun anotherSum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}