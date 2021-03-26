package money

import jdk.nashorn.internal.objects.NativeRegExp.source




class Bank {
    fun reduce(source: Expression, to: String): Money {
        if (source is Money) return source
        val sum = source as Sum
        return sum.reduce(to)
    }
}