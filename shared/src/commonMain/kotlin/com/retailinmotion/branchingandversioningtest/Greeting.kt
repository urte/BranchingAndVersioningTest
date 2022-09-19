package com.retailinmotion.branchingandversioningtest

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}