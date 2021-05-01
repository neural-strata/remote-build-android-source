package org.neuralstrata.remotebuild.subject.app

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.filters.MediumTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.neuralstrata.remotebuild.subject.app.ui.theme.RemoteBuildSubjectAppTheme

@MediumTest
class ScreenKtTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setUp() {
        composeTestRule.setContent {
            RemoteBuildSubjectAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Screen()
                }
            }
        }
    }

    @Test
    fun app_launches() {
        composeTestRule.onNodeWithTag("gigel").assertExists()
    }

}