package org.neuralstrata.remotebuild.subject.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import org.neuralstrata.remotebuild.subject.app.ui.theme.RemoteBuildSubjectAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RemoteBuildSubjectAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Screen()
                }
            }
        }
    }
}

@Composable
fun Screen() {
    Greeting("Android")
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.testTag("gigel"))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RemoteBuildSubjectAppTheme {
        Screen()
    }
}
