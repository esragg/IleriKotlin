package com.example.ilerikotlin

class BirinciThread:Thread() {

    override fun run() {
        for (i in 100..199){
            println("Birinci thread: $i")
            Thread.sleep(100)
        }
    }
}