package com.altov.vlad.taskmanager

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel:ViewModel() {

    var name = MutableLiveData<String>()
    var desc = MutableLiveData<String>()

}