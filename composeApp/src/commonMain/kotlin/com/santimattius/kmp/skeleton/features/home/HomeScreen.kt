package com.santimattius.kmp.skeleton.features.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.koin.getScreenModel
import com.santimattius.kmp.skeleton.core.ui.components.AppBar

object HomeScreen : Screen {

    @Composable
    override fun Content() {
        val screenModel = getScreenModel<HomeScreenModel>()
        HomeScreenContent(screenModel)
    }
}

@Composable
fun HomeScreenContent(
    screenModel: HomeScreenModel,
) {
    Scaffold(
        topBar = { AppBar(title = "Notifications") },
    ) { padding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val state by screenModel.state.collectAsState()
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                value = state.title,
                label = { Text("Title") },
                onValueChange = screenModel::onTitleChange
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                value = state.content,
                label = { Text("Content") },
                onValueChange = screenModel::onContentChange
            )

            Button(
                modifier = Modifier.fillMaxWidth().padding(8.dp),
                shape = RectangleShape,
                onClick = screenModel::sendNotification
            ) {
                Text("Send notification")
            }
        }
    }
}
