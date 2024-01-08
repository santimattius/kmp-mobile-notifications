package com.santimattius.kmp.skeleton.features.home

import cafe.adriel.voyager.core.model.StateScreenModel
import com.mmk.kmpnotifier.notification.NotifierManager
import kotlinx.coroutines.flow.update


data class HomeUiState(
    val title: String = "",
    val content: String = "",
)

class HomeScreenModel : StateScreenModel<HomeUiState>(HomeUiState()) {

    fun onTitleChange(value: String) {
        mutableState.update { it.copy(title = value) }
    }

    fun onContentChange(value: String) {
        mutableState.update { it.copy(content = value) }
    }

    fun sendNotification() {
        val notifier = NotifierManager.getLocalNotifier()
        val currentState = mutableState.value
        notifier.notify(currentState.title, currentState.content)
    }
}