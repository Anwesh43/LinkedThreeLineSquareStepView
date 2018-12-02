package com.anwesh.uiprojects.threelinesquarestepview

/**
 * Created by anweshmishra on 02/12/18.
 */

import android.view.View
import android.view.MotionEvent
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Color
import android.content.Context
import android.app.Activity

val nodes : Int = 5
val lines : Int = 4
val color : Int = Color.parseColor("#0D47A1")
val sizeFactor : Int = 3
val strokeFactor : Int = 120
val scGap : Float = 0.05f
val scDiv : Double = 0.51
