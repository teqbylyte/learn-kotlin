fun main(args: Array<String>) {

    // loop with a range of numbers
    for (i in 1..10) {
        println("i = $i")
    }

    println("\n");

    // in range but lesser than the last number
    for (j in 2..<8) {
        println("j = $j")
    }

    println("\n");

    // in range from higher to lower and skip by 2
    for (k in 30 downTo 20 step 2) {
        println("k = $k")
    }
}