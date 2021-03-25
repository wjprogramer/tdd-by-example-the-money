package money

open class Money(open var amount: Int) {
    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
    }

    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.javaClass == money.javaClass
                && amount == money.amount
    }
}