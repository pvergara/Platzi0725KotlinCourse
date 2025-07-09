@file:Suppress("CanBeVal", "KotlinConstantConditions", "UnusedVariable", "RedundantExplicitType", "unused")

package class7

@Suppress("UNNECESSARY_SAFE_CALL")
fun main(){
    var mandatoryEmail:String = "user@email.com"
    var optionalEmail:String? = null

//    mandatoryEmail = null
//    println(optionalEmail!!)

    val mailLength = optionalEmail?.length?:0

    optionalEmail = "newMail@optional.com"
    println(mailLength)

    val forcedMailLength = optionalEmail?.length?:0

    println(forcedMailLength)

    val myEmail: String = "lerele@lolailo.com"
    val myName: String? = null

    val nameToShow = myName?:"Anonymous"
    val nameLength = myName?.length ?:0
    println("Email: $myEmail, User: $nameToShow, length: $nameLength")
}