package com.handsome.module.main.ui.viewmodel.dialog

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.handsome.lib.util.util.myCoroutineExceptionHandler
import com.handsome.module.main.bean.StatusBean
import com.handsome.module.main.net.ApiService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class CommentDialogViewModel : ViewModel() {

    private val _mutableSendComment = MutableStateFlow<StatusBean?>(null)
    val sendComment get() = _mutableSendComment.asStateFlow()

    fun sendComment(videoId : Long,commentText : String){
        viewModelScope.launch(myCoroutineExceptionHandler){
            ApiService.INSTANCE.sendComment(videoId,commentText)
        }
    }

}