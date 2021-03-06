package `money_transfers`

fun main() {
    val amount = 1000000
    val commission = 0.0075
    val minCommission = 35.00
    val result: Double = if (amount * commission > minCommission) {amount * commission} else {minCommission}

    println("Сумма перевода: $amount, комиссия за первод: $result")
}