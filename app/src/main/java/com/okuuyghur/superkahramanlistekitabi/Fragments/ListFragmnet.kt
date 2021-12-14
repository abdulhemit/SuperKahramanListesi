package com.okuuyghur.superkahramanlistekitabi.Fragments

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.okuuyghur.superkahramanlistekitabi.R
import com.okuuyghur.superkahramanlistekitabi.R_Adapter
import com.okuuyghur.superkahramanlistekitabi.databinding.FragmentListFragmnetBinding


class ListFragmnet : Fragment() {
    private var _binding:FragmentListFragmnetBinding? = null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentListFragmnetBinding.inflate(layoutInflater,container,false)

        // veri hazirligi
        val KahramanIsimleri=ArrayList<String>()
        KahramanIsimleri.add("batman")
        KahramanIsimleri.add("iron man")
        KahramanIsimleri.add("spiderman")
        KahramanIsimleri.add("superman")

        // verimsiz tanimlamalar

        val batmanBitmap=BitmapFactory.decodeResource(requireContext().resources,R.drawable.batman)
        val ironmanBitmap=BitmapFactory.decodeResource(requireContext().resources,R.drawable.ironman)
        val spidermanBitmap=BitmapFactory.decodeResource(requireContext().resources,R.drawable.spiderman)
        val supermanBitmap=BitmapFactory.decodeResource(requireContext().resources,R.drawable.superman)

        val KahramanGorselleri = ArrayList<Bitmap>()
            KahramanGorselleri.add(batmanBitmap)
            KahramanGorselleri.add(ironmanBitmap)
            KahramanGorselleri.add(spidermanBitmap)
            KahramanGorselleri.add(supermanBitmap)
        val layoutManager=LinearLayoutManager(requireContext())
        binding?.recyclerview?.layoutManager = layoutManager
        binding?.recyclerview?.adapter= R_Adapter(KahramanIsimleri)

        return binding?.root
    }

}