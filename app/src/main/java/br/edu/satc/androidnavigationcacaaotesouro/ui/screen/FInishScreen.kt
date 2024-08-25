package br.edu.satc.androidnavigationcacaaotesouro.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.satc.androidnavigationcacaaotesouro.R
import br.edu.satc.androidnavigationcacaaotesouro.ui.theme.AndroidNavigationCacaAoTesouroTheme
import coil.compose.AsyncImage

@Composable
fun FinishScreen(onNavigateToHome: () -> Unit) {
    BaseScreen(title = "FIM") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Parabéns voce encontrou o tesouro",
                fontFamily = FontFamily.Cursive,
                fontSize = 36.sp,
                modifier = Modifier.padding(16.dp)
            )
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Para carregar imagens dinamicas da web
//                AsyncImage(
//                    model = "https://img.freepik.com/psd-premium/bau-do-tesouro-cheio-de-moedas-de-ouro-isoladas-em-fundo-transparente_879541-732.jpg",
//                    contentDescription = null,
//                )
                Image(painter = painterResource(id = R.drawable.tesouro), contentDescription = "")
                Button(onClick = { onNavigateToHome() }) {
                    Text(text = "VOLTAR PARA A HOME")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FinishPreview() {
    AndroidNavigationCacaAoTesouroTheme {
        FinishScreen({})
    }
}