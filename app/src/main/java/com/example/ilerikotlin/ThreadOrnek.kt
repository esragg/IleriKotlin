package com.example.ilerikotlin

fun main(){

    val birinciThread = BirinciThread()
    birinciThread.start() //run() metodunu Thread mantigiyla calistirir

    val ikinciThread = Thread(IkinciThread())
    ikinciThread.start()

    for (i in 900..999){
        println("Main Thread: $i")
        Thread.sleep(100)
    }
}