package com.example.ilerikotlin

import java.lang.Exception

fun main() {

    val x = 10
    val y = 5

    val dizi = Array<Int>(2){0} //[0,0]

    try {
        println("Sonuuc : ${x/y}")
        println("Islem Tamam")
        dizi[4] = 8
    } catch (e:ArithmeticException) {
            println("Sifira bolmeye calistiniz")

    } catch (e:IndexOutOfBoundsException) {
            println("Dizinin boyutunu astiniz")
    }

}