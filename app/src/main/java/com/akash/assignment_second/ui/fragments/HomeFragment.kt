package com.akash.assignment_second.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.akash.assignment_second.R
import com.akash.assignment_second.databinding.FragmentHomeFragBinding
import com.akash.assignment_second.databinding.FragmentLoginFragBinding
import com.akash.assignment_second.ui.viewmodel.HomeFragVM


class HomeFragment : Fragment() {
    lateinit var binding: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflater.inflate(R.layout.fragment_home_frag,null)
      val bt = binding.findViewById<Button>(R.id.go)
        bt.setOnClickListener {
            val blankFragment = BlankFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.addToBackStack(null)
            transaction.replace(R.id.nav_host_fragment_container,blankFragment).commit()
//            findNavController().navigate(R.id.d)
        }
        return binding

    }

}