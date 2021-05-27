package com.example.kdoctest.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kdoctest.R
/**
 * @author[vinayak patil]
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
    fun testMethode(name : String){
        Log.e("MainActivity",name)
    }
}