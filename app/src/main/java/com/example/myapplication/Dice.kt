package com.example.myapplication

class Dice(val numSide: Int) {
    fun roll(): Int{
        return (1..numSide).random()
    }
}