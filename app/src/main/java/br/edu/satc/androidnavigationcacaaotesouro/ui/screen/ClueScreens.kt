package br.edu.satc.androidnavigationcacaaotesouro.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.satc.androidnavigationcacaaotesouro.ui.theme.AndroidNavigationCacaAoTesouroTheme

@Composable
fun ClueScreen01(onNavigateToNextClue: () -> Unit, onNavigateToBack: () -> Unit){
    BaseScreen("Dica 01") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "O que tem dentes, mas não morde?",
                fontFamily = FontFamily.Cursive,
                lineHeight = 36.sp,
                fontSize = 36.sp,
                modifier = Modifier.padding(16.dp)
            )
            Column (
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Resposta")})
                Button(onClick = { onNavigateToNextClue() }) {
                    Text(text = "PROXIMA DICA")
                }
                Button(onClick = { onNavigateToBack() }, colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)) {
                    Text(text = "VOLTAR")
                }
            }
        }
    }
}

@Composable
fun ClueScreen02(onNavigateToNextClue: () -> Unit, onNavigateToBack: () -> Unit){
    BaseScreen("Dica 02") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "O que é cheio de buracos, mas ainda consegue segurar água?",
                fontFamily = FontFamily.Cursive,
                lineHeight = 36.sp,
                fontSize = 36.sp,
                modifier = Modifier.padding(16.dp)
            )
            Column (
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Resposta")})
                Button(onClick = { onNavigateToNextClue() }) {
                    Text(text = "PROXIMA DICA")
                }
                Button(onClick = { onNavigateToBack() }, colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)) {
                    Text(text = "VOLTAR")
                }
            }
        }
    }
}

@Composable
fun ClueScreen03(onNavigateToNextClue: () -> Unit, onNavigateToBack: () -> Unit){
    BaseScreen("Dica 03") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Eu corro, mas nunca ando. Tenho uma boca, mas nunca falo. Tenho um leito, mas nunca durmo. Quem sou eu?",
                fontFamily = FontFamily.Cursive,
                lineHeight = 48.sp,
                fontSize = 36.sp,
                modifier = Modifier.padding(16.dp)
            )
            Column (
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //OutlinedTextField(value = "", onValueChange = {}, label = { Text(text = "Resposta")})
                Button(onClick = { onNavigateToNextClue() }) {
                    Text(text = "PROXIMA DICA")
                }
                Button(onClick = { onNavigateToBack() }, colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)) {
                    Text(text = "VOLTAR")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CluePreview() {
    AndroidNavigationCacaAoTesouroTheme {
        ClueScreen03({},{})
    }
}