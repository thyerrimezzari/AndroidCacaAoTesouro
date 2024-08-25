package br.edu.satc.androidnavigationcacaaotesouro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavOptions
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.ClueScreen01
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.ClueScreen02
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.ClueScreen03
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.FinishScreen
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.Home
import br.edu.satc.androidnavigationcacaaotesouro.ui.screen.Login
import br.edu.satc.androidnavigationcacaaotesouro.ui.theme.AndroidNavigationCacaAoTesouroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidNavigationCacaAoTesouroTheme {
                val navigationController = rememberNavController()
                NavHost(navController = navigationController, startDestination = "login") {
                    composable("login") {
                        Login {
                            navigationController.navigate(
                                "home",
                                navOptions {
                                    popUpTo(navigationController.graph.startDestinationId) {
                                        inclusive = true
                                    }
                                })
                        }
                    }
                    composable("home") {
                        Home { navigationController.navigate("clue01") }
                    }
                    composable("clue01") {
                        ClueScreen01(onNavigateToNextClue = { navigationController.navigate("clue02") }) {
                            navigationController.navigateUp()
                        }
                    }

                    composable("clue02") {
                        ClueScreen02(onNavigateToNextClue = { navigationController.navigate("clue03") }) {
                            navigationController.navigateUp()
                        }
                    }

                    composable("clue03") {
                        ClueScreen03(onNavigateToNextClue = { navigationController.navigate("finish") }) {
                            navigationController.navigateUp()
                        }
                    }

                    composable("finish") {
                        FinishScreen {
                            navigationController.navigate(
                                "home",
                                navOptions {
                                    popUpTo(navigationController.graph.startDestinationId) {
                                        inclusive = true
                                    }
                                })
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

