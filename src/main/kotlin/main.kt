var amount: Double = 35.00
const val percentOfCommission = 0.075
const val minCommission = 35.00
fun main() {
    println("Your commission: ${isAmountMoreThan35(amount)} rubles")
}
fun isAmountMoreThan35 (amount: Double): Double {
    return if (amount > minCommission) {
        amount * percentOfCommission
    } else minCommission
}