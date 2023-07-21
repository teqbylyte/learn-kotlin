fun main(args: Array<String>) {
    var a = 12
    var b = 4

    var max = getMax(a, b)

    println(getMax(a, b))
    println(max)
}

fun  getMax(a: Int, b: Int): Int
{
    return if (a > b) a else b;
}

// Function overloading. Using the same function name but when different parameter types are used or the operation is different.
fun getMax(x: Double, y: Double) = if (x > y) x else y