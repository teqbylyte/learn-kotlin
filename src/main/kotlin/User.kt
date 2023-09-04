class User(var firstName: String, var lastName: String) {

    val fullName: String = "$firstName $lastName"

    // Initializer blocks are used to perform certain operations at the point of instantiating the object.
    // Initializers are called after the primary constructor of the class.
    init {
        firstName = firstName.uppercase();
        lastName = lastName.uppercase()

        println("This is the class for $fullName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $fullName")
    }

    fun nameLength(): Int = "$firstName$lastName".length
}