package com.example.KotlininPractice

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by BiG on 6/12/2017 AD.
 */
class RecursiveTest {

    @Test
    fun tailrecFibo() {
        fun fibo(count: Int): Int {
            tailrec fun fiboTail(count: Int, value: Int, accum: Int = 0): Int {
                if (count == 0) return accum
                else return fiboTail(count - 1, accum, value + accum)
            }
            return fiboTail(count, 1)
        }

        assertEquals(5, fibo(5))
    }


    @Test
    fun tailrectFactorial() {
        fun fact(number: Int): Int {
            tailrec fun factTail(number: Int, sum: Int): Int {
                if (number == 0) return sum
                else return factTail(number - 1, number * sum)
            }
            return factTail(number, 1)
        }

        assertEquals(120, fact(5))
    }
}



