package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_15PercentNoRoundup() {
        val amount = 100.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(15)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20PercentWithRoundup() {
        val amount = 10.65
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(3)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}