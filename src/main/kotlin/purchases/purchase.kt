package purchases


fun main() {

    val vip = true
    var sumPurchases = 100000
    val amount = 100
    var result: Double
    if ( (1000 < sumPurchases) && (sumPurchases < 10000)) {
        result = (amount - 100).toDouble()
        sumPurchases += amount
    } else if ( sumPurchases > 10000) {
        result = amount - amount*0.05
        sumPurchases += amount
    } else {
        result = amount.toDouble()
        sumPurchases += amount
    }

    if (vip) {result -= result*0.01}

    println("Сумма покупки: $result")
}