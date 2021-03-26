package money

open class Money(open var amount: Int, protected val currency: String) {
    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")

        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.currency() == money.currency()
                && amount == money.amount
    }

    override fun toString() = "$amount $currency"

    open fun times(multiplier: Int): Money = Money(amount * multiplier, currency)

    fun currency() = currency
}