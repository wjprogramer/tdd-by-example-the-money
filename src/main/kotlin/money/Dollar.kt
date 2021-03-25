package money

class Dollar(private var amount: Int): Money() {
    override fun equals(obj: Any?): Boolean {
        return obj is Dollar && amount == obj.amount
    }

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}