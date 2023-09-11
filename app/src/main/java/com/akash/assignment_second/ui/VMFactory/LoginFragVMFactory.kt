package com.akash.assignment_second.ui.VMFactory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akash.assignment_second.ui.viewmodel.LoginVM

class LoginFragVMFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginVM(context) as T
    }
}