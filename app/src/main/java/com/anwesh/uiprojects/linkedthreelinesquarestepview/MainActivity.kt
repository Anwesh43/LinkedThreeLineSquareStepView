package com.anwesh.uiprojects.linkedthreelinesquarestepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.threelinesquarestepview.ThreeLineSquareStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ThreeLineSquareStepView.create(this)
    }
}
