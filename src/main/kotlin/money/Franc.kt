package money

class Franc(private val amount: Int) {
    override fun equals(obj: Any?): Boolean {
        val franc = obj as Franc?
        return amount == franc!!.amount
    }

    operator fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}