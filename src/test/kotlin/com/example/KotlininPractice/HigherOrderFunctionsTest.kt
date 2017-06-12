package com.example.KotlininPractice

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by BiG on 6/12/2017 AD.
 */
class HigherOrderFunctionsTest {
    @Test
    fun makeMathFunctionTest() {

        fun makeMathFunction(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }
        val mult2 = makeMathFunction(2)

        assertEquals(6, mult2(3))
    }

    @Test
    fun mathOnListTest() {
        fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int): List<Int> {
            return numList.map(myFunc)
        }

        val multiply2 = { num: Int -> num * 2 }

        assertThat(arrayListOf(2, 4, 6, 8, 10), `is`(mathOnList(arrayOf(1, 2, 3, 4, 5), multiply2)))

    }
}
