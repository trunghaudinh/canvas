package vn.trunghaudinh.canvas.custom_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import java.util.jar.Attributes

class CustomView(context : Context, attrs : AttributeSet) : View(context,attrs) {
    private var paint : Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var widthSize : Int = 0
    private var heightSize : Int = 0

    init {
        paint.run {
            color = Color.RED
            strokeWidth  = 10f
            style = Paint.Style.STROKE
        }
    }

//    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
//        val widthMod = MeasureSpec.getMode(widthMeasureSpec)
//        val heightMod = MeasureSpec.getMode(heightMeasureSpec)
//
//        widthSize = MeasureSpec.getSize(widthMeasureSpec)/3
//        val m = MeasureSpec.UNSPECIFIED
//        Log.i("smiles ","Width Mod = $widthMod ||  height mod = $heightMod")
//    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

//        canvas?.drawLine(0F,200f,200f,200f,paint)
//        canvas?.drawCircle(widthSize.toFloat(),widthSize.toFloat(),100f,paint)
    }

}
