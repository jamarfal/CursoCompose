package com.jamarfal.cursocompose.ui.screens.login

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jamarfal.cursocompose.TButton
import com.jamarfal.cursocompose.ui.screens.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    Screen {
        LoginForm(
            "user",
            "password",
            Modifier
                .wrapContentSize()
                .background(Color.LightGray)
                .padding(16.dp)
        )
    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun LoginForm(
    userHint: String,
    passwordHint: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        modifier = modifier
    ) {
        OutlinedTextField(
            value = TextFieldValue(text = userHint),
            onValueChange = {})

        TextField(
            value = TextFieldValue(text = passwordHint),
            onValueChange = {})

        TButton(text = "Login")
    }
}

@Preview
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun LoginPreview() {
    Login()
}