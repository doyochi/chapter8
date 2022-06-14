
package id.hikmah.binar.jetpack.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.hikmah.binar.jetpack.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { LoginInterface() }
//        observeData()
    }

    @Preview(showSystemUi = true)
    @Composable
    private fun LoginInterface() {
        Column(
            modifier = Modifier.padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Start Title
            Text(
                text = "Login",
                color = Color.Black,
                fontSize = 24.sp,
            )
            // End Title

            Spacer(modifier = Modifier.height(32.dp))

            // Logohshdfjs
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 0.dp, height = 140.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Email
            var textEmail by remember { mutableStateOf("") }
            TextField(
                value = textEmail,
                onValueChange = { textEmail = it },
                label = { Text(text = "Email") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
//                    cursorColor = colorResource(id = R.color.purple_binar),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                textStyle = TextStyle(
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Password
            var textPassword by remember { mutableStateOf("") }
            var passVisibility by remember { mutableStateOf(false) }

            val icon = if (passVisibility) {
                painterResource(id = R.drawable.ic_invisible)
            } else {
                painterResource(id = R.drawable.ic_visible)
            }
            TextField(
                value = textPassword,
                onValueChange = { textPassword = it },
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
//                    cursorColor = colorResource(id = R.color.purple_binar),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                trailingIcon = {
                    IconButton(onClick = {
                        passVisibility = !passVisibility
                    }) {
                        Icon(
                            painter = icon,
                            contentDescription = "visibility"
                        )
                    }
                },
                textStyle = TextStyle(
                ),
                visualTransformation = if (passVisibility) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                }
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Button Login
            Button(
                onClick = {  },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
//                    colorResource(id = R.color.purple_binar)
                ),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(
                    start = 20.dp,
                    end = 20.dp,
                    top = 16.dp,
                    bottom = 16.dp
                )
            ) {
                Text(
                    text = "Login",
                    color = Color.White,
                    fontSize = 18.sp,
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

//             Start Daftar
//            ClickableText(
//                text = AnnotatedString("Belum punya akun? Daftar"),
//                style = TextStyle(
//                    textAlign = TextAlign.Center
//                ),
//                onClick = {
//                moveToRegister()
//                }
//            )

        }
    }
}