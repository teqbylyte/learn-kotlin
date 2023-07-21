fun main(args: Array<String>) {
    println(greeting("Lyte"))
    println(greeting(msg = "Good day", name = "Chima"))
}

fun greeting(name: String, msg: String = "Hello"): String {
    return "$msg $name";
}