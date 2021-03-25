package money

abstract class Money(open var amount: Int) {
    companion object {
        fun dollar(amount: Int): Money = Dollar(amount)

        fun franc(amount: Int): Money = Franc(amount)
    }

    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.javaClass == money.javaClass
                && amount == money.amount
    }

    abstract fun times(multiplier: Int): Money

    abstract fun currency(): String
}