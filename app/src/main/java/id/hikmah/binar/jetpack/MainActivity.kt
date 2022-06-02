package id.hikmah.binar.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            DecoratedComposablePreview()
        }
    }

    @Composable
    fun SimpleComposable(){
        Text ("Hello World")
    }

//    @Preview(shadowSystemUi = true)
    @Composable
    fun DecoratedComposablePreview(){
        Text("Hello World")
    }

    @Composable
    fun ComposablePreview() {
        SimpleComposable()
    }
}