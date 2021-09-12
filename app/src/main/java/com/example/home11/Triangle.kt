package com.example.home11

class Triangle : Figures() {
    fun med(edTriangle: String, ugol: String, dlina2: String): String {
        if (edTriangle.isNotEmpty() && ugol.isNotEmpty() && dlina2.isNotEmpty()) {
            val rez = edTriangle.toInt() + ugol.toInt() + dlina2.toInt()
            return rez.toString()
        } else {
            return ""
        }


    }

    override val length: Int = 3
    override val injection: Int = 3
    override val circle: Int = 3


}