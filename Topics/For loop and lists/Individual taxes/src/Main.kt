fun main() {
    val incomes = MutableList<Double>(readln().toInt()) { readln().toDouble() }
    val taxes = MutableList<Double>(incomes.size) { incomes[it] * (readln().toDouble() / 100) }
    println(taxes.indexOf(taxes.maxOrNull()) + 1)
}