package com.example.pratica_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class RGB {

    private var RGB: MutableSet<Int>

    constructor() {
        this.RGB = mutableSetOf()
        this.setRGB()
    }

    private fun setRGB() {

        val cor = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        RGB.add(cor)

    }

    override fun toString(): String {
        return this.RGB.toString()
    }

}
