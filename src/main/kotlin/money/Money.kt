package money

open class Money(open var amount: Int, protected val currency: String): Expression {
    companion object {
        fun dollar(amount: Int): Money = Money(amount, "USD")

        fun franc(amount: Int): Money = Money(amount, "CHF")
    }

    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.currency() == money.currency()
                && amount == money.amount
    }

    override fun toString() = "$amount $currency"

    open fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun currency() = currency

    operator fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        val rate = bank.rate(currency, to)
        return Money(amount / rate, to)
    }
}