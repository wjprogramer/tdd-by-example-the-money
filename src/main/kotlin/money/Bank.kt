package money

class Bank {
    fun reduce(source: Expression, to: String): Money {
        val sum = source as Sum
        val amount = sum.augend.amount + sum.addend.amount
        return Money(amount, to)
    }
}