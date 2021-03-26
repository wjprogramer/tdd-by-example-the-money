package money

import java.util.Hashtable

class Bank {
    private val rates = Hashtable<Pair, Int>()

    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }

    fun rate(from: String, to: String): Int {
        if (from == to) return 1
        return rates[Pair(from, to)] ?: 0
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