fun main(args: Array<String>) {
    val user = User("charity", "onyema");

    user.printWithPrefix("Mr.")
    println(user.nameLength())

    user.fullName = "Lyte Osasu"

    println(user.fullName)
}