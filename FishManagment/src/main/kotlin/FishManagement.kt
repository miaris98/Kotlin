import java.util.*

fun main(args: Array<String>) {

println("Hello ,${args[0]}")

val isUnit =  println("Whatever")
println(isUnit)

val temprature = 60
val isHot=if (temprature>50) true else false
println(isHot)

val message = "you are ${if (temprature>50)"fried" else "safe"} fish"
println(message)

feedtheFish()
    // lamba example
var numberOfPiranhas=2
var breed = { numberOfPiranhas: Int ->
    println(numberOfPiranhas * 3)
}
    breed(numberOfPiranhas)
}

fun feedtheFish(){
    val day =randomDay()
    val food = fishFood(day)
    println("today is ${day} and the fish will eat ${food}")
}

fun randomDay():String {

    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val filtered=week.filter { it[0]=='S' }
    println("Filtered :${filtered}")
    val fileteredAsSeaquese =week.asSequence().filter { it[0]=='T' }
    println("FilteredAsS :${fileteredAsSeaquese}")
    println("FilteredAsS :${fileteredAsSeaquese.toList()}")

    return week[Random().nextInt(7)]
}

fun fishFood(day:String):String {
    var food=""
    when(day){
        "Monday" -> food = "1"
        "Tuesday" -> food = "2"
        "Wednesday" -> food = "3"
        "Thursday" -> food = "4"
        "Friday" -> food = "5"
        "Saturday" -> food = "6"
        "Sunday" -> food = "7"
    }
    return food
}