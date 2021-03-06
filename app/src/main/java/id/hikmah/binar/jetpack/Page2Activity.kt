package id.hikmah.binar.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        setContent {
            Column {
                TitleText(title = "Hello World")
            }
        }
    }

    @Preview(showSystemUi = false)
    @Composable
    fun BodyPage2(){
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
//            SetTextStyling(displayText = "Hello")
        }
    }

    @Preview(showSystemUi = false)
    @Composable
    fun TitleText(title: String = "test") {
        Text(
            text = title, color = Color.Blue
        )
    }

    @Preview(showSystemUi = false)
    @Composable
    fun TitleHello() {
        Text("Hello")
        TitleText("Hello World")
    }
}