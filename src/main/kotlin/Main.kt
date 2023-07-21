fun main(args: Array<String>) {
    println(sum(2, 44, 34, 22, 23))
}

fun sum(vararg numbers: Int): String {
    var result = 0;

    for (number in numbers) {
        println(number)
        result += number;
    }

    return  result.toString();
}