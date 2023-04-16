package com.example.replacement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import org.w3c.dom.Text


class Page2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            // Names I want: Andrew, Chris, Alfonso, Matthew, Walter, Zoya, Danielle,
            // Holly, Ida, Tiana, Sam, Madison, Sloan, Jordan
            //Text(text = "Here are your generated names.")
        }
    }
}