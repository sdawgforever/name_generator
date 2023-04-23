package com.example.replacement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import com.example.replacement.ui.theme.ReplacementTheme
import org.w3c.dom.Text


class Page2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ReplacementTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Text(text = "page2 test")
                }
            }
            // Names I want: Andrew, Chris, Alfonso, Matthew, Walter, Zoya, Danielle,
            // Holly, Ida, Tiana, Sam, Madison, Sloan, Jordan
        //Text(text = "Here are your generated names.")
        }
    }
}