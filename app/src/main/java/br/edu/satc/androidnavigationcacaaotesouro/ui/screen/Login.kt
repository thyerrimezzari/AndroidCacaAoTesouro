package br.edu.satc.androidnavigationcacaaotesouro.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.outlined.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.satc.androidnavigationcacaaotesouro.R
import br.edu.satc.androidnavigationcacaaotesouro.ui.theme.AndroidNavigationCacaAoTesouroTheme

@Composable
fun Login(onNavigateToHome: () -> Unit) {
    val mModifier = Modifier.padding(top = 8.dp)
    var login by remember {
        mutableStateOf("")
    }
    var pass by remember {
        mutableStateOf("")
    }
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(value = login, onValueChange = {login = it}, label = { Text(text = "Login") })
        OutlinedTextField(
            value = pass,
            onValueChange = {pass = it},
            label = { Text(text = "Senha") },
            modifier = mModifier,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibility = !passwordVisibility
                }) {
                    Icon(imageVector = if(passwordVisibility) Icons.Filled.VisibilityOff else Icons.Filled.Visibility, contentDescription = "Show Password")

                }
            },
        )
        Button(onClick = { onNavigateToHome() }, modifier = mModifier) {
            Text(text = "LOGIN")
        }
        TextButton(onClick = { /*TODO*/ }, modifier = mModifier) {
            Text(text = "ESQUECI MINHA SENHA")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyPreview() {
    AndroidNavigationCacaAoTesouroTheme {
        Login({})
    }
}