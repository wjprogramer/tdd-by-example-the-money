package money

class Franc(amount: Int, override val currency: String): Money(amount) {
    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}