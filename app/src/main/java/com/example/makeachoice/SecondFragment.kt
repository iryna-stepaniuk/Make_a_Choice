package com.example.makeachoice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv : TextView = view.findViewById(R.id.textview_second)
        val text = arguments?.getString("MyArg")
        tv.text = text
        view.findViewById<Button>(R.id.button_makeChoice).setOnClickListener {
            //findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
            Toast.makeText(context, "Олег - найкращий!!!", Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.button_Return).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}