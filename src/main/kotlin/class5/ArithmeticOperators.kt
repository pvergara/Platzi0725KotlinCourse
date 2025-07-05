package class5

import kotlin.math.abs

fun main() {
    val receivedMailsCounter = 25
    val sentMailsCounter = 15

    val modulus = receivedMailsCounter % 7 //Reminder = 4:

    println(modulus)

    val calc = 10 + (5 * 2)
    println(calc)

    val calc2 = (10 + 5) * 2
    println(calc2)

    val emailsPerWeek =
        (receivedMailsCounter * 7) +
        (sentMailsCounter * 7)

    println(emailsPerWeek)

    var counter = 10
    println(counter)
    counter += 1
    println(counter)
    counter -= 2
    println(counter)
    counter *= 2
    println(counter)
    counter /= 2
    println(counter)
    counter %= 2
    println(counter)

    val sentMailsCounterToday = 12
    val sentMailsCounterYesterday = 8

    val incrementBetweenYesterdayAndToday = abs(sentMailsCounterToday - sentMailsCounterYesterday)
    val percentageIncrement = (incrementBetweenYesterdayAndToday.toFloat() / sentMailsCounterYesterday.toFloat()) * 100

    println("Yesterday: $percentageIncrement%")

}