package com.nissy.wearelearningfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.nissy.wearelearningfragments.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {
     private lateinit var binding: FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?) : View? {
      binding = FragmentTitleBinding.inflate(inflater,container,false)
        return binding.root
    }
}

