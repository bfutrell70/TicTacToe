package com.example.brian.tictactoe

import android.support.design.widget.Snackbar
import android.view.View

class HelloKotlin {
    fun displayMessage(view: View) {
        Snackbar.make(view, "Hello Kotlin!!", Snackbar.LENGTH_LONG).setAction("Action", null).show();
    }
}