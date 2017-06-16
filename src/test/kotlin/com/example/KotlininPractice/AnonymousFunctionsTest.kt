package com.example.KotlininPractice

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by BiG on 6/14/2017 AD.
 */
class AnonymousFunctionsTest {

    @Test
    fun literalsFunctionTest() {
        assertEquals(listOf(1, 2, 3).filter { it > 1 }, listOf(2, 3))
    }

    @Test
    fun functionReference() {
        fun isEven(k: Int): Boolean = k % 2 == 0
        fun Int.isOdd(): Boolean = this % 2 != 0

        val ints = listOf(1, 2, 3, 4, 5)

        assertEquals(ints.filter(::isEven), listOf(2, 4))
        assertEquals(ints.filter { it.isOdd() }, listOf(1, 3, 5))
        assertEquals(ints.filter(Int::isOdd), listOf(1, 3, 5))
    }

    @Test
    fun functionReferenceMultipleParam() {
        fun foo(a: Double, b: Double, f: (Double, Double) -> Double) = f(a, b)

        assertEquals(foo(1.0, 2.0, { a, b -> Math.pow(a, b) }), 1.0)
        assertEquals(foo(1.0, 2.0, Math::pow), 1.0)

    }
}
