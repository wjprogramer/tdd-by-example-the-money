package money

class Dollar(amount: Int): Money(amount) {
    private val currency = "USD"

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }

    override fun currency() = currency
}