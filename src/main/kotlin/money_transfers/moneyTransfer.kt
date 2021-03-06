package money_transfers

var promotion = false

fun getCommisionMastercardAndMaestro (sumPrevTransf : Double, transfer : Double) : Double {
    if ((promotion) && (sumPrevTransf + transfer > 300) && (sumPrevTransf + transfer < 75000)) {
        return 0.00
    } else {
        return transfer*0.006+20
    }

}

fun getCommisionVisaAndMir (transfer : Double) : Double {
        return if (transfer*0.0075 < 35) {35.00} else {transfer*0.0075}
}


fun getCommision(accountType : String = "VK Pay", sumPrevTransf : Double = 0.0, transfer : Double):Double {
    when (accountType) {
        "VK Pay" -> return 0.0
        "Mastercard" -> return getCommisionMastercardAndMaestro (sumPrevTransf, transfer)
        "Maestro" -> return getCommisionMastercardAndMaestro (sumPrevTransf, transfer)
        "Visa" ->  return getCommisionVisaAndMir(transfer)
        "Мир" -> return getCommisionVisaAndMir(transfer)
        else -> return 0.0
    }
}

fun moneyTramsfer (accountType : String = "VK Pay", sumPrevTransf : Double = 0.0, transfer : Double) {
    if ((accountType == "VK Pay") && (transfer < 15000) && (sumPrevTransf + transfer < 40000)) {
        println("Сумма перевода: $transfer, комиссия за первод: ${getCommision(accountType = accountType, sumPrevTransf = sumPrevTransf, transfer = transfer)}")
    } else if ((accountType != "VK Pay") && (sumPrevTransf + transfer < 600000)) {
        println("Сумма перевода: $transfer, комиссия за первод: ${getCommision(accountType = accountType, sumPrevTransf = sumPrevTransf, transfer = transfer)}")
    } else {
        println("Операция не может быть выполнена, превышен лимит")
    }
}


fun main() {

    println("---------------------------    VK Pay -------------------------------")
    moneyTramsfer(sumPrevTransf = 1000.00, transfer = 1000.00)
    moneyTramsfer(sumPrevTransf = 1000.00, transfer = 16000.00)
    moneyTramsfer(sumPrevTransf = 100000.00, transfer = 1000.00)

    println()
    println("------------------------    Mastercard и Maestro   -------------------------")
    moneyTramsfer(accountType = "Mastercard", sumPrevTransf = 40000.00, transfer = 10000.00)
    moneyTramsfer(accountType = "Mastercard", sumPrevTransf = 600000.00, transfer = 10000.00)

    promotion = true
    println()
    println("------------------------    Mastercard и Maestro (акция) -------------------------")
    moneyTramsfer(accountType = "Mastercard", sumPrevTransf = 40000.00, transfer = 10000.00)
    moneyTramsfer(accountType = "Mastercard", sumPrevTransf = 400000.00, transfer = 10000.00)
    moneyTramsfer(accountType = "Mastercard", sumPrevTransf = 600000.00, transfer = 10000.00)

    println()
    println("------------------------------    Мир и Visa  -------------------------------------")
    moneyTramsfer(accountType = "Мир", sumPrevTransf = 40000.00, transfer = 100.00)
    moneyTramsfer(accountType = "Мир", sumPrevTransf = 40000.00, transfer = 10000.00)
    moneyTramsfer(accountType = "Мир", sumPrevTransf = 600000.00, transfer = 10000.00)
}