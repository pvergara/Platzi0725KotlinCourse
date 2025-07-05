package class4

@Suppress("UnusedVariable", "unused", "RedundantExplicitType", "VariableInitializerIsRedundant")
fun main() {
    val userName = "Cardi" //Immutable
    var userName2 = "Nihil"
    var nonReadEmails = 5


    userName2 = "Emeritus"
    println(userName2)

    println(nonReadEmails)
    nonReadEmails = 3
    println(nonReadEmails)

    println("User: $userName2, Emails: $nonReadEmails")
    val totalEmails: Int = 150
    val totalBytes: Long = Long.MAX_VALUE

    val percentage: Float = 75.5f
    val accuracy: Double = 99.9999999991

    val subjet: String = "Meeting"
    val urgen: Boolean = true

    val number = 42
    val numberAsString = number.toString()
    val textAsNumber = "25".toInt()

    println(numberAsString)
    println(textAsNumber)

    val readMailCounter = 15
    val totalMailCounter = 20

    val readMailAsPercentage = readMailCounter / totalMailCounter.toFloat()
    println(readMailAsPercentage)
    println("The real percentage is $readMailAsPercentage%")

}