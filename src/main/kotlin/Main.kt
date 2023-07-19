fun main(args: Array<String>) {
    var sentence: String? = "This is just a sentence";

    println(sentence?.length)

    println(sentence!!.length * 2) // When you're absolutely certain it's not null

    sentence = null;

    val mainSentence = sentence ?: "This is the main sentence"

    println(mainSentence)
}