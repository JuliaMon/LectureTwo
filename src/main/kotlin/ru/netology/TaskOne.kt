package ru.netology


fun main(){
    val initialPayment = 5690
    val amount = (initialPayment * 100).toLong()
    val commission = getCommissionResult(amount)
    val commissionMessage = "Комиссия: $commission копеек"

    println(commissionMessage)
}

fun getCommissionResult(amount: Long): Long {
    val minCommission = 3500L
    val commissionRate = 0.0075
    val resultCommission = (amount * commissionRate).toLong()

    return if (resultCommission <= minCommission) {
        minCommission
    } else {
        resultCommission
    }
}