package money

open class Money(open var amount: Int) {
    override fun equals(money: Any?): Boolean {
        return money is Money
                && this.javaClass == money.javaClass
                && amount == money.amount
    }
}