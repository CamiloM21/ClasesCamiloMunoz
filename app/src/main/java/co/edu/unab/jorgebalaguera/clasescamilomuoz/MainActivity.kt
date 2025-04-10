package co.edu.unab.jorgebalaguera.clasescamilomuoz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.unab.jorgebalaguera.clasescamilomuoz.ui.theme.ClasesCamiloMuñozTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            ClasesCamiloMuñozTheme {

                val mynavController = rememberNavController()
                val startDestination = "login"

                NavHost(
                    navController = mynavController,
                    startDestination = startDestination,
                    modifier = Modifier.fillMaxSize()

                ){
                    composable("login") { LoginScreen(mynavController)  }
                    composable("register") { RegisterScreen(mynavController)  }
                    composable ("home"){ HomeScreen()  }

                }









            }
        }
    }
}


