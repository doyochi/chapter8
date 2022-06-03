package id.hikmah.binar.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DecoratedComposablePreview()
        }
    }
    
    @Composable
    fun SimpleComposable(){
        Column() {
            Text(
                "Hello World",
                fontSize = 12.sp,
                color = Color.Gray,
                style = TextStyle(),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Ini Button")
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Ini text button")
            }
            TextField(value = "ini text fiels", onValueChange = {})
        }
        Text(
            "Hello World",
            fontSize = 12.sp,
            color = Color.Gray,
            style = TextStyle(),
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )

////        Text("Hello World", fontSize = TextUnit.Unspecified, color = Color.Gray)
//        Button(onClick = { /*TODO*/}) {
//
//        }
//        TextButton(onClick = { /*TODO*/ }) {
//
//        }
//        TextField(value = "", onValueChange = {})
//        Column() {
//
//        }
//        Row() {
//
//        }
    }

    @Composable
    fun StyledTextField() {
        var value by remember { mutableStateOf("Hello\nWorld\nInvisible") }

        TextField(
            value = value,
            onValueChange = { value = it },
            label = { Text("Enter text") }
        )
    }

    @Preview(showSystemUi = false)
    @Composable
    fun DecoratedComposablePreview(){
        Text("Hello World")
    }

    @Preview(showSystemUi = false)
    @Composable
    fun ComposablePreview() {
        SimpleComposable()
    }
}