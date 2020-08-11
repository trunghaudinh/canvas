package vn.trunghaudinh.canvas.custom_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import kotlin.math.min


class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private var paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var desiredSize = 150

    init {
        paint.run {
            color = Color.RED
            strokeWidth = 10f
            style = Paint.Style.STROKE
        }

//        desiredSize = width/3
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(
            measureDimension(desiredSize, widthMeasureSpec),
            measureDimension(desiredSize, heightMeasureSpec)
        )
    }

    private fun measureDimension(desiredSize: Int, measureSpec: Int): Int {
        var result: Int
        val specMode = MeasureSpec.getMode(measureSpec)
        val specSize = MeasureSpec.getSize(measureSpec)

        result = when (specMode) {
            MeasureSpec.EXACTLY -> specSize
            MeasureSpec.AT_MOST -> min(desiredSize, specSize)
            else -> desiredSize
        }
        return result
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.i("smie", "onDraw: ${convertPixelsToDp(width.toFloat(),context)}  ${convertPixelsToDp(height.toFloat(),context)}")
        canvas?.drawLine(0F, 100f, 100f, 100f, paint)


    }

    fun convertPixelsToDp(px: Float, context: Context): Float {
        return px / (context.resources
            .displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    }

}
