package money

class Franc(amount: Int): Money(amount) {
    operator fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}