fun main(args: Array<String>) {
    sayHello("Lyte", 29)
    sayHello("Chima", 12)
}

fun  sayHello(name: String, age: Int) {
    val msg = when (age) {
        in 0..18 -> "You're too young for this.";
        in 19 .. 65 -> "Your age fits and you can proceed."
        else -> "Can not find use case."
    }

    println("Hell $name! $msg")
}