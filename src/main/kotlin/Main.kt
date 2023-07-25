fun main(args: Array<String>) {

    var i = 0
    while (i < 5) {
        println("i = $i")
        i++

        if (i == 4) break
    }

    println("=================\n")

    i = 10;

    do {
        i--

        if (i in 4..6) continue
        println("i is $i")

    } while (i in 1..10)

    // Continue and break also work in for loop

    println("=================\n")

    parent@ while (i < 10) {
        println("i is $i")

        while (i < 5) {
            if (i == 2) break@parent
            println("inner i is $i")
            i++
        }
    }
}