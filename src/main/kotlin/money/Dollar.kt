package money

class Dollar(amount: Int): Money(amount) {
    override fun equals(money: Any?): Boolean {
        return money is Money && amount == money.amount
    }

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}