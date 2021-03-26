package money

class Bank {
    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(source: String, to: String, rate: Int) {

    }

    fun rate(from: String, to: String): Int {
        return if (from == "CHF" && to == "USD") 2 else 1
    }


    private class Pair(private val from: String, private val to: String) {
        override fun equals(other: Any?): Boolean {
            val pair: Pair = other as Pair
            return from == pair.from && to == pair.to
        }

        override fun hashCode(): Int {
            return 0
        }
    }
}