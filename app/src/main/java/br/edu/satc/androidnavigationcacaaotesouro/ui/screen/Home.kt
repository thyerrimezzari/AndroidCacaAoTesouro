package br.edu.satc.androidnavigationcacaaotesouro.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.edu.satc.androidnavigationcacaaotesouro.ui.theme.AndroidNavigationCacaAoTesouroTheme
import java.time.format.TextStyle

@Composable
fun Home(
    darkMode: Boolean,
    onDarkModeChanged: (darkMode: Boolean) -> Unit,
    onNavigateToFirstClue: () -> Unit
) {
    BaseScreen("Home") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Caça ao Tesouro",
                fontFamily = FontFamily.Cursive,
                fontSize = 36.sp
            )
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Button(onClick = { onNavigateToFirstClue() }) {
                    Text(text = "INICIAR JOGO")
                }

                var stateDarkMode by remember {
                    mutableStateOf(darkMode)
                }
                Text(text = "Dark Mode", modifier = Modifier.padding(top = 26.dp))
                Switch(
                    checked = stateDarkMode,
                    onCheckedChange = { it -> stateDarkMode = it; onDarkModeChanged(it) })
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    AndroidNavigationCacaAoTesouroTheme {
        Home(darkMode = false, onDarkModeChanged = {darkMode ->  }, {})
    }
}