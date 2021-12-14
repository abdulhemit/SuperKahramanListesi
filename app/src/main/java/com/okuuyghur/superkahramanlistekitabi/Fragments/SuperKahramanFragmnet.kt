package com.okuuyghur.superkahramanlistekitabi.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.okuuyghur.superkahramanlistekitabi.R
import com.okuuyghur.superkahramanlistekitabi.databinding.FragmentSuperKahramanFragmnetBinding


class SuperKahramanFragmnet : Fragment() {
    private var _binding:FragmentSuperKahramanFragmnetBinding? = null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentSuperKahramanFragmnetBinding.inflate(layoutInflater,container,false)
        return binding?.root
    }

}