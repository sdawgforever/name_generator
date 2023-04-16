package com.example.replacement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.tooling.preview.Preview
import com.example.replacement.ui.theme.ReplacementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReplacementTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        val checkedState = remember { mutableStateOf(false) }
                        Text(text = "Please check the box of the type of name you want.")
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = { checkedState.value = it }
                        )
                        Text(text = "Female")

                        val checkedState2 = remember { mutableStateOf(false) }
                        Checkbox(
                            checked = checkedState2.value,
                            onCheckedChange = { checkedState2.value = it }
                        )
                        Text(text = "Male")
                        val checkedState3 = remember { mutableStateOf(false) }
                        Checkbox(
                            checked = checkedState3.value,
                            onCheckedChange = { checkedState3.value = it }
                        )
                        Text(text = "Neutral Gender")
                        Button(onClick = { /* Do something */ }) {
                            Text("Next")
                        }
                    }

                }
            }
        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReplacementTheme {
        Greeting("Android")
    }
}

fun Clicked(){

}