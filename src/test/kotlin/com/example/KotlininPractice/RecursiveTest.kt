package com.example.KotlininPractice

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by BiG on 6/12/2017 AD.
 */
class RecursiveTest {

    @Test
    fun fibonacci() {
        tailrec fun fibonacciTailrec(count: Int, value: Int = 1, accum: Int = 0): Int {
            if (count == 0) return accum
            return fibonacciTailrec(count - 1, accum, value + accum)
        }
        assertEquals(5, fibonacciTailrec(5))
    }

    @Test
    fun factorial() {
        tailrec fun factorialTailrec(number: Int, sum: Int = 1): Int {
            if (number == 0) return sum
            return factorialTailrec(number - 1, number * sum)
        }
        assertEquals(120, factorialTailrec(5))
    }
}
