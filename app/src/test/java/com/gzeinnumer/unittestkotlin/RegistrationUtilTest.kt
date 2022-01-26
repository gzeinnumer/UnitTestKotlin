package com.gzeinnumer.unittestkotlin

import com.google.common.truth.Truth.assertThat
import org.junit.Test

//todo 2
class RegistrationUtilTest{

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and currectly repeated password returs true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "zein",
            "123456",
            "123456"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "fadli",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "zein",
            "123456",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "zein",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than w digits password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "zein",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }
}