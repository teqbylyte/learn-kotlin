fun main(args: Array<String>) {
    // Ones an array is defined, the size cannot be changed, therefore immutable.
    val names = arrayOf("Lyte", "Canaan", "John")

    // An array can also contain multiple types of elements unless explicitly defined.
    val elements = arrayOf("Name", 2, true, 23, 42, 54, names)

    elements[1] = "two"
    println(names[0])
    println(elements[1])

    // loop through an array
    for (e in elements) {
        if (e is Number) {
            println(e)
        }
    }

    println("The number of elements in the array is ${names.size}")

    println(minOrMax(arrayOf(5, 44, 390, 90, 20), true))
}

fun minOrMax(elements: Array<Int>, getMin: Boolean = false): Int
{
    if (getMin) {
        return elements.min()
    }

    return elements.max();
}