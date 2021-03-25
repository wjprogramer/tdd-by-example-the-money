package money

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        assertEquals(10, product?.amount)
        product = five.times(3)
        assertEquals(15, product?.amount)
    }
}