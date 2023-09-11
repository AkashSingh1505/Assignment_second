package com.akash.assignment_second.ui.viewmodel

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginVM(private val context : Context) : ViewModel() {
     val email = MutableLiveData<String>()
     val password = MutableLiveData<String>()
    private val _isValidate = MutableLiveData<Boolean>()
    val isValidate : LiveData<Boolean>
        get() =  _isValidate

     fun onLoginClickListener(view : View){
        checkValidation()
    }

    private fun checkValidation() {
        if(email.value.toString().trim().contains("@gmail.com",true)){
            if(password.value!!.toString().trim().length>=6){
                Toast.makeText(context,"Login...",Toast.LENGTH_LONG).show()
                _isValidate.value=true
                _isValidate.value=false

            }else{
                Toast.makeText(context,"Invalid Password",Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(context,"Invalid Email",Toast.LENGTH_LONG).show()
        }
    }

    init {
        _isValidate.value = false
    }
}