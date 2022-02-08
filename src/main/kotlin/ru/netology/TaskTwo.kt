package ru.netology

fun main() {
    val likes:Long = 11
    println(resultOutput(likes))
}
fun resultOutput(likes:Long):String {
    var result = "людям"
    if (likes % 10 == 1L) {
        result = "человеку"
    }

    if (likes % 100 == 11L) {
        result = "людям"
    }

    if (likes % 1000 == 0L) {
        result = "человек"
    }
    return "Понравилось $likes $result"
}



