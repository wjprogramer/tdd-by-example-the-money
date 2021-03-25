package money

class Dollar(amount: Int): Money(amount) {
    override fun equals(obj: Any?): Boolean {
        return obj is Money && amount == obj.amount
    }

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}