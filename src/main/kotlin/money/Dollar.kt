package money

class Dollar(amount: Int, override val currency: String): Money(amount) {
    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}