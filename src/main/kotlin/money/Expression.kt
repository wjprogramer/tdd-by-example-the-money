package money

interface Expression {
    fun reduce(bank: Bank, to: String): Money

    operator fun plus(addend: Expression): Expression

    operator fun times(multiplier: Int): Expression
}