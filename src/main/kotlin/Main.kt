fun main(args: Array<String>) {
    var type = "super-admin";

    var info = when (type) {
        "admin", "super-admin" -> "This user is an admin"
        "lecturer" -> "This user is a lecturer"
        "student" -> {
            println("just for test")
            "This user is a student"
        }
        else -> "This is a normal user."
    }

    println(info)

    var timeInSec = type.length * 2;

    when (timeInSec) {
        in 0..60 -> println("Time is less than a minute - ${timeInSec}s")
        else -> println("Time is greater than a minute - ${timeInSec / 60}m")
    }
}