package com.example.replacement

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Checkbox
import androidx.compose.ui.text.style.TextAlign
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
                    var nameState : MutableState<String> = remember { mutableStateOf("None") }
                    if(nameState.value.equals("None")){
                    Column {
                        val checkedState = remember { mutableStateOf(false) }
                        Text(text = "\n" + "Please check the box of the type of name you want." + "\n")
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Checkbox(
                                checked = checkedState.value,
                                onCheckedChange = { checkedState.value = it }
                            )
                            Text(text = "Female")
                        }

                        val checkedState2 = remember { mutableStateOf(false) }
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Checkbox(
                                checked = checkedState2.value,
                                onCheckedChange = { checkedState2.value = it }
                            )
                            Text(text = "Male")

                        }



                        val checkedState3 = remember { mutableStateOf(false) }
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Checkbox(
                                checked = checkedState3.value,
                                onCheckedChange = { checkedState3.value = it }
                            )
                            Text(text = "Neutral Gender")
                        }

                        Button(onClick = {
                           if(checkedState.value == true){
                               nameState.value = "Female"
                           }else if(checkedState2.value == true){
                                nameState.value = "Male"
                            }else if(checkedState3.value == true){
                                nameState.value = "Neutral Gender"
                            }

                        }
                        )
                        {
                            Text("Generate Names")
                        }
                    }
                    }
                    if(nameState.value.equals("Male")){
                        Male()
                    }

                    if(nameState.value.equals("Female")){
                        Female()
                    }

                    if(nameState.value.equals("Neutral Gender")){
                        NeutralGender()
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
@Composable
fun Female(){
    Text(text = "Zoya, \n" + "\n" +

            "Danielle, \n" + "\n" +
            "Ida, \n" + "\n" +
            "Holly, \n" + "\n" +
            "Giana")
}
@Composable
fun Male(){
    Text(text = "Andrew, \n" + "\n" + "Chris, \n" + "\n" + "Alfonso, \n" + "\n" + "Matthew, \n" + "\n" + "Walter")
}
@Composable
fun NeutralGender(){
    Text(text = "Sloan, \n" + "\n" + "Sam,\n" + "\n" + "Madison, \n" + "\n" + "Jordan")
}