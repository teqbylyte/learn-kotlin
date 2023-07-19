fun main(args: Array<String>) {
    val myNumber = 20;
    var isAdult = true;

    if (myNumber > 20) {
        println("The number is greater than 20")
    } else if (myNumber == 20) {
        println("The number is equal to 20")
    } else {
        println("The number is less than 20")
    }

    if (isAdult && myNumber > 20) {
        println("Allow this adult cos both match")
    }

    if (isAdult || myNumber > 20) {
        println("Allow this adult cos any matches")
    }

    var msg = if (isAdult && myNumber == 20) "You can proceed." else "You cannot proceed."

    println(msg)
}