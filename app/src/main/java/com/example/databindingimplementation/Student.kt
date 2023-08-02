package com.example.databindingimplementation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

data class Student(var name: String = "",var num: Int = 0)
// {
//    var name: MutableLiveData<String> = MutableLiveData("Prabal")
//
//    init {
//        name.value = temp
//    }
//    fun setName(newName: String){
//        name.value = newName
//    }
//}
