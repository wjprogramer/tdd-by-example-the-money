package money

class Franc(amount: Int): Money(amount) {
    override fun equals(obj: Any?): Boolean {
        val franc: Money = obj as Franc?
        return amount == franc!!.amount
    }

    operator fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}