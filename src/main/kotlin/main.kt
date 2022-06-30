fun main() {
    val amount: Double = 100.00
    val percentOfCommission = 0.075
    if (amount >= 35) {
        var commission: Double = amount * percentOfCommission
        println("Your commission: $commission rubles")
    } else println("Your commission 35 rubles")
}