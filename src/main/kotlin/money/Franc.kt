package money

class Franc(amount: Int, currency: String?): Money(amount) {
    override val currency = "CHF"

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier, null)
    }
}