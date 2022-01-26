package com.gzeinnumer.unittestkotlin.part4

import android.content.Context

//todo 6
class ResourceComperer {
    fun isEquals(context: Context, resId: Int, string: String) : Boolean{
        return context.getString(resId) == string
    }
}