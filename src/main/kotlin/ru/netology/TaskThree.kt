package ru.netology

fun main() {
    val spentMoney = 100001
    val isMeloman = true
    var payment = 500.0

    if (spentMoney >= 1001 && spentMoney <= 10000){
        payment = payment - 100
    }

    if (spentMoney >= 10001){
        payment = payment - (payment * 0.05)
    }

    if (isMeloman) {
        payment = payment - (payment * 0.01)
    }

    println(payment)

}
