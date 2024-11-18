package com.example.androidapp2.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidapp2.R

@Composable
fun SignupScreen(navController: NavController){
    var username by remember {
        mutableStateOf(value = "")
    }
    var password by remember {
        mutableStateOf(value = "")
    }
    var Confirmpassword by
    remember {
        mutableStateOf(value = "")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Register Here",
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Black)
                .padding(20.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(10.dp))
        Image(modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .height(80.dp) ,
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Instagram logo"
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = username,
            onValueChange = {userName -> username = userName},
            label = { Text(text = "Enter username") },
            placeholder = { Text(text = "Please enter username") }
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = password,
            onValueChange = {Password -> password = Password},
            label = { Text(text = "Enter password") },
            placeholder = { Text(text = "Please enter password") },
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = Confirmpassword,
            onValueChange = {ConfirmPassword -> Confirmpassword = ConfirmPassword},
            label = { Text(text = "ConfirmPassord") },
            placeholder = { Text(text = "Please enter Password") },

            )

        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { },
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
                color = Color.Blue,
                text = "LOGIN HERE") }
        Spacer(modifier = Modifier.height(10.dp))
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignupScreenPreview(){
    SignupScreen(rememberNavController())

}