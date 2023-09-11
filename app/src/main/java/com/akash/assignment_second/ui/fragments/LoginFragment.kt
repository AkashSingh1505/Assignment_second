package com.akash.assignment_second.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.akash.assignment_second.R
import com.akash.assignment_second.databinding.FragmentLoginFragBinding
import com.akash.assignment_second.ui.VMFactory.LoginFragVMFactory
import com.akash.assignment_second.ui.viewmodel.LoginVM


class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginFragBinding
    lateinit var loginFragVMFactory: LoginFragVMFactory
    lateinit var loginVM: LoginVM
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentLoginFragBinding>(
            inflater,
            R.layout.fragment_login_frag,
            container,
            false
        )
        loginFragVMFactory = LoginFragVMFactory(this.requireContext())
        loginVM = ViewModelProvider(this, loginFragVMFactory).get(LoginVM::class.java)
        binding.viewModal = loginVM
        binding.lifecycleOwner = this
        if( (MyApp.instance as MyApp).sharedPreferences.getBoolean("isChecked",false)){
            val homeFrag = HomeFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack(null)
            transaction.replace(R.id.nav_host_fragment_container,homeFrag).commit()
        }

        loginVM.isValidate.observe(this) {
            if (it.equals(true)) {
                if(binding.vwChecked.isChecked){
                    (MyApp.instance as MyApp).sharedPreferences.edit().putBoolean("isChecked",true).apply()
                }
                val homeFrag = HomeFragment()
                val transaction = parentFragmentManager.beginTransaction()
                transaction.addToBackStack(null)
                transaction.replace(R.id.nav_host_fragment_container,homeFrag).commit()
            }
        }
        return binding.root
    }

}