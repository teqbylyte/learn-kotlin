class User(var firstName: String, var lastName: String) {

    // Initializer blocks are used to perform certain operations at the point of instantiating the object.
    // Initializers are called after the primary constructor of the class.
    init {
        firstName = firstName.uppercase();
        lastName = lastName.uppercase()

        val db = Db.connection();

        println("This is the class for $firstName.")
    }

    // To use this property in the init block, then it should be declared before it.
    var fullName: String = "$firstName $lastName"
        get() = "Full Name: $field" // Getter for the full name property
        set(value) {
            field = if (value.startsWith("Lyte")) "Lyte Iwu" else value
        }

    fun printWithPrefix(prefix: String) {
        println("$prefix $fullName")
    }

    fun nameLength(): Int = "$firstName$lastName".length
}