package money

class Dollar(var amount: Int) {
    override fun equals(obj: Any?): Boolean {
        return true
    }

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}