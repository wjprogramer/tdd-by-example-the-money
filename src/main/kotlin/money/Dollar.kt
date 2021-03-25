package money

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar? {
        amount *= multiplier
        return null
    }
}