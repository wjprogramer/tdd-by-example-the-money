package money

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(Dollar(10), product)
        product = five.times(3)
        assertEquals(Dollar(15), product) // 也改用 Dollar 跟 Dollar 比
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar (6))
    }
}