package money

class Franc(amount: Int): Money(amount) {
    private val currency = "CHF"

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }

    override fun currency() = currency
}