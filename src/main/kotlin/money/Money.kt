package money

open class Money(open var amount: Int, protected val currency: String) {
    companion object {
        fun dollar(amount: Int): Money = Dollar(amount, "USD")

        fun franc(amount: Int): Money = Franc(amount, "CHF")
    }

    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.javaClass == money.javaClass
                && amount == money.amount
    }

    open fun times(multiplier: Int): Money? = null

    fun currency() = currency
}