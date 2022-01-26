package com.gzeinnumer.unittestkotlin

import com.google.common.truth.Truth
import org.junit.Test

//todo 4
class HomeworkTestFib{
    @Test
    fun `n -100`(){
        val c = Homework.fib(-100)

        Truth.assertThat(c).isEqualTo(0)
    }
    @Test
    fun `n -1`(){
        val c = Homework.fib(-1)

        Truth.assertThat(c).isEqualTo(0)
    }

    @Test
    fun `n 1`(){
        val c = Homework.fib(1)

        Truth.assertThat(c).isEqualTo(1)
    }

    @Test
    fun `n 0`(){
        val c = Homework.fib(0)

        Truth.assertThat(c).isEqualTo(0)
    }
    @Test
    fun `n more than 2`(){
        val c = Homework.fib(2)

        Truth.assertThat(c).isAtLeast(1)
    }
    @Test
    fun `n more than 3`(){
        val c = Homework.fib(3)

        Truth.assertThat(c).isAtLeast(1)
    }
}