class User(var firstName: String, var lastName: String) {
    fun fullName(): String = "$firstName $lastName"

    fun printWithPrefix(prefix: String) {
        println("$prefix ${fullName()}")
    }

    fun nameLength(): Int = "$firstName$lastName".length
}