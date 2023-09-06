// Singleton: This is used to have only one instance of a class.
// This uses a companion object to define the single instance.
// It also requires a private constructor on the class. This keyword is used to restrict the creation of instances of the class outside the class.

/**
 * A singleton created using the ```private constructor``` keyword along with a ```companion object```
 */
class Db private constructor(){
    // A companion object creates a method or property that belongs to the class directly and not an instance of it
    // (like static properties and methods)
    companion object {
        private var instance: Db? = null;

        /**
         * Getting the single instance of the DB
         */
        fun connection(): Db {
            if (instance == null) {
                instance = Db()
                println("Instance was null initially")
            }

            return instance as Db;
        }
    }
}