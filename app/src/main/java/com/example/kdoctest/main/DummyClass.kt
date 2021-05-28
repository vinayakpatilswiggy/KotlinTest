package com.example.kdoctest.main
/**
 * This is DummyClass documentation
 * @author[vinayak patil]
 * @param
 * @since[1.0.0]
 *
 * @constructor is used for init class with a int
 */
class DummyClass constructor(val myVal :Int) {

    /**
     * @property myVal is used for some other things
     */

    constructor(myVal: Int, myVal2: Int):this(myVal){

    }
    /**
     * This is dummyFunction description
     * @see MainActivity
     *
     * @exception NullPointerException
     */
    fun dummyFunction(){

    }

    /**
     * This is dummyFunction description
     * @see SubCodeA
     *
     * @sample dummyFunction
     *
     * @throws NullPointerException
     */
    fun dummyFunction2(){

    }

    /**
     * @suppress this methode is not mentioned in documentation
     */
    fun suppressMethod(){

    }
}