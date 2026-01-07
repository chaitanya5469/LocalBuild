package chaitu.android.localbuild

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import chaitu.android.localbuild.ui.theme.LocalBuildTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val message = GreetingLogic.buildGreeting("Android")

        setContent {
            LocalBuildTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    Greeting(message)
                }
            }
        }
    }
}

/**
 * Pure business logic (easy to unit tests)
 */
object GreetingLogic {
    fun buildGreeting(name: String): String {
        require(name.isNotBlank()) { "Name must not be blank" }
        return "Hello $name!"
    }
}

@Composable
fun Greeting(text: String, modifier: Modifier = Modifier) {
    Text(text = text, modifier = modifier)
}
