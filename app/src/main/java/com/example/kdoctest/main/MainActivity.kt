package com.example.kdoctest.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kdoctest.R
/**
 * @author[vinayak patil]
 * @param
 * @since[1.0.0]
 *
 * This is the only activity description
 *
 */
class MainActivity : AppCompatActivity() {
    /**
     * This is dummy property
     */

    var dummyVariable = "test"

    /**
     * This is onCreate method description
     *
     * @return type of return parameter is Int
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testMethode("")
    }

    /**
     * This is first method description
     * @param[savedInstanceState]
     * this this test param description
     *
     * @param[name] the type of a member in this group.
     * @constructor Creates an empty group.
     */
    fun testMethode(name : String):String{
        Log.e("MainActivity",name+dummyVariable)
        return dummyVariable
    }

    /**
     * @return type of return parameter is String
     *
     * This is private methode
     */
    private fun privateTestMethode():String{
        return dummyVariable
    }

    /**
     * This is deprecated methode
     */
    @Deprecated("deprecated example")
    fun deprecatedMethode(){

    }
}