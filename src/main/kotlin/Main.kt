fun main(args: Array<String>) {
    var x = 93;
    val y = 23;

    // Operand (x and y) are objects affected by operators
    // Expression is an operation which evaluates to a single value

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    var result = x + y

    result += 4
    println("result = $result")

    x = 0

    println("x is ${x++}")
    println("x is $x")
    println("x is ${++x}")
}