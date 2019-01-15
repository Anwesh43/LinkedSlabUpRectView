package com.anwesh.uiprojects.linkedslabuprectview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.slabuprectview.SlabUpRectView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SlabUpRectView.create(this)
    }
}
