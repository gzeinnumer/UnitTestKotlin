package com.gzeinnumer.unittestkotlin.part4

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth
import com.google.common.truth.Truth.assertThat
import com.gzeinnumer.unittestkotlin.R
import org.junit.After
import org.junit.Before
import org.junit.Test

//todo 7
//@Before @Test @After
class ResourceCompererTest{
    lateinit var resourceComperer : ResourceComperer

    @Before
    fun setup(){
        resourceComperer = ResourceComperer()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context =  ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComperer.isEquals(context, R.string.app_name, "UnitTest Kotlin")

        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context =  ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComperer.isEquals(context, R.string.app_name, "UnitTest")

        assertThat(result).isFalse()
    }
}