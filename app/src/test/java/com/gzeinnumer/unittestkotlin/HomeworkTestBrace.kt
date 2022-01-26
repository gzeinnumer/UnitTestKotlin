package com.gzeinnumer.unittestkotlin

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test

//todo 5
class HomeworkTestBrace{

    @Test
    fun `if ( = 1 and ) = 0 return false`(){
        val str = "(a*b"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isFalse()
    }

    @Test
    fun `if ( = 0 and ) = 1 return false`(){
        val str = "a*b)"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isFalse()
    }

    @Test
    fun `if ( = 0 and ) = 0 return true`(){
        val str = "a*b"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isTrue()
    }

    @Test
    fun `if ( more than ) return false`(){
        val str = "((a*b)"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isFalse()
    }

    @Test
    fun `if ( less than ) return false`(){
        val str = "(a*b))"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isFalse()
    }

    @Test
    fun `if ( same with ) return true`(){
        val str = "(a*b)"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isTrue()
    }

    @Test
    fun `if ( same with more ) return true`(){
        val str = "((a*b))"
        val c = Homework.checkBraces(str)

        Truth.assertThat(c).isTrue()
    }
}