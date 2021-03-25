package money

class Franc(amount: Int): Money(amount) {
    override fun equals(money: Any?): Boolean {
        val franc: Money? = money as Money?
        return amount == franc!!.amount
    }

    operator fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }
}