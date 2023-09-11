package com.akash.assignment_second.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.akash.assignment_second.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ViewDataBinding? = DataBindingUtil.setContentView<ViewDataBinding>(this,
            R.layout.activity_main
        )
    }
}
