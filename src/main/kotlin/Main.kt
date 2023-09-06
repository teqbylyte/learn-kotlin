fun main(args: Array<String>) {
    val db1 = Db.connection();

    println("line 1")

    val db2 = Db.connection()

    println("line 2")

    val person = User("lyte", "onyema")

    println("line 3")

    val config = Config
    println("line 4")

    val config2 = Config

    println("line 5")
}