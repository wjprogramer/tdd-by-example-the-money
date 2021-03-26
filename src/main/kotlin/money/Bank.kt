package money

class Bank {
    fun reduce(source: Expression, to: String): Money {
        if (source is Money)
            return source.reduce(to) as Money
        val sum = source as Sum
        return sum.reduce(to)
    }
}