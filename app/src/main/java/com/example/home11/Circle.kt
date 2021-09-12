package com.example.home11

class Circle : Figures() {
    fun med(edCircle: String): String {
        if (edCircle.isNotEmpty()) {
            val result = edCircle.toInt() / length * circle
            return result.toString()
        } else {
            return ""
        }
    }

    override val length: Int = 3
    override val injection: Int = 3
    override val circle: Int = 3

}