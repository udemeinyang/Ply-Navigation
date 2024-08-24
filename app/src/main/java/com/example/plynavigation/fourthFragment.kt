package com.example.plynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plynavigation.databinding.FragmentFourthBinding
import com.example.plynavigation.databinding.FragmentSecondBinding

class fourthFragment : Fragment() {

    private var _binding: FragmentFourthBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fourth, container, false)
        _binding = FragmentFourthBinding.inflate(inflater, container, false)
        return binding.root

    }

        //return inflater.inflate(R.layout.fragment_fourth, container, false)
    }


