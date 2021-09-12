package com.example.home11

class Square : Figures() {
    fun med(edSquare: String): String {
        if (edSquare.isNotEmpty()) {
            val result = edSquare.toInt() + length * injection
            return result.toString()
        } else {
            return ""
        }

    }

    override val length: Int = 4
    override val injection: Int = 3
    override val circle: Int = 3


}