package money

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(Dollar(10), product); // Dollar 跟 Dollar 比較
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar (6))
    }
}