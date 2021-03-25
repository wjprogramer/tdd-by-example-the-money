package money

class Franc(amount: Int): Money(amount) {
    operator fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}