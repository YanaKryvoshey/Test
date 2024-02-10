package com.example.test

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context) : View(context) {
    private val paint = Paint()

    init {
        // Customize the appearance of the view here
        paint.color = Color.BLACK
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2.0f
    }

    override fun onDraw(canvas: Canvas?) {
        // Draw the view's content here
        canvas?.drawCircle(100f, 100f, 50f, paint)

        canvas?.drawLine(200f,200f,300f,300f,paint)
    }

    // Add any additional methods or behavior here
}