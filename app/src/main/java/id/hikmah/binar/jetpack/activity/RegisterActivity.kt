package id.hikmah.binar.jetpack.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.hikmah.binar.jetpack.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { RegisterInterface() }
    }

    @Preview(showSystemUi = true)
    @Composable
    private fun RegisterInterface() {

        Column(
            modifier = Modifier.padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Start Title
            Text(
                text = "Register",
                color = Color.Black,
                fontSize = 24.sp,
            )
            // End Title

            Spacer(modifier = Modifier.height(30.dp))

            // Start Logo Image
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(width = 0.dp, height = 140.dp)
            )
            // End Logo Image

            Spacer(modifier = Modifier.height(30.dp))

            // Start TextField Username
            var textUsername by remember { mutableStateOf("") }
            TextField(
                value = textUsername,
                onValueChange = { textUsername = it },
                label = { Text(text = "Username") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
//                    cursorColor = colorResource(id = R.color.purple_binar),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                textStyle = TextStyle(
                )
            )
            // End TextField Username

            Spacer(modifier = Modifier.height(15.dp))

            // Start TextField Email
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
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
//                    cursorColor = colorResource(id = R.color.purple_binar),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                textStyle = TextStyle(
                )
            )
            // End TextField Email

            Spacer(modifier = Modifier.height(15.dp))

            // Start TextField Password
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
                shape = RoundedCornerShape(10.dp),
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
            // End TextField Password

            Spacer(modifier = Modifier.height(15.dp))

            // Start TextField Confirm Password
            var textConfirmPassword by remember { mutableStateOf("") }
            var passConfirmVisibility by remember { mutableStateOf(false) }

            val iconConfirm = if (passConfirmVisibility) {
                painterResource(id = R.drawable.ic_invisible)
            } else {
                painterResource(id = R.drawable.ic_visible)
            }
            TextField(
                value = textConfirmPassword,
                onValueChange = { textConfirmPassword = it },
                label = { Text(text = "Konfirmasi Password") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                ),
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
//                    cursorColor = colorResource(id = R.color.purple_binar),
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                ),
                trailingIcon = {
                    IconButton(onClick = {
                        passConfirmVisibility = !passConfirmVisibility
                    }) {
                        Icon(
                            painter = iconConfirm,
                            contentDescription = "visibility"
                        )
                    }
                },
                textStyle = TextStyle(
                ),
                visualTransformation = if (passConfirmVisibility) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                }
            )
            // End TextField Confirm Password

            Spacer(modifier = Modifier.height(30.dp))

            // Start Button Register
            Button(
                onClick = {
//                    doRegister(textUsername, textEmail, textPassword, textConfirmPassword)
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
//                    colorResource(id = R.color.purple_binar)
                ),
                shape = RoundedCornerShape(10.dp),
                contentPadding = PaddingValues(
                    start = 20.dp,
                    end = 20.dp,
                    top = 15.dp,
                    bottom = 15.dp
                )
            ) {
                Text(
                    text = "Register",
                    color = Color.White,
                    fontSize = 20.sp,
                )
            }
            // End Button Register

        }
    }
}