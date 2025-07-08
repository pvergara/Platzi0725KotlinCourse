@file:Suppress("KotlinConstantConditions")

package class6

fun main(){
    val receivedEmailCounter = 15
    val sentMailsCounter = 16
    val mailLimit = 20

    val hasEmails = receivedEmailCounter > 16
    val exceedOrEqualSent = sentMailsCounter >= mailLimit
    val sentEqualsToReceived = sentMailsCounter == receivedEmailCounter


    println("User has emails? $hasEmails")
    println("User has reached the limit of sent emails? $exceedOrEqualSent")
    println("Sent mails are equals to the received? $sentEqualsToReceived")

    val sentDifferentThanReceived = sentMailsCounter != receivedEmailCounter
    println("Sent mails are different to the received? $sentDifferentThanReceived")

    val emailAddress ="user@example.com"
    val password = "123456"

    val hasAt = emailAddress.contains("@")
    val hasAPoint = emailAddress.contains(".")

    val isValidMailAddress = hasAt && hasAPoint

    println("Email address has at? $hasAt")
    println("Email address is valid? $isValidMailAddress")
    val shortPassword = password.length < 6
    val longPassword = password.length > 20
    val isInvalidPassword = shortPassword || longPassword
    println("Password is invalid? $isInvalidPassword")

    println("Is invalid email? ${!isValidMailAddress}")
}