package com.example.makeachoice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import java.util.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = Bundle()

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val text = view.findViewById<Button>(R.id.button_first).text.toString()
            bundle.putString("MyArg", text)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        view.findViewById<Button>(R.id.button_second).setOnClickListener {
            val text = view.findViewById<Button>(R.id.button_second).text.toString()
            bundle.putString("MyArg", text)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
        view.findViewById<Button>(R.id.button_third).setOnClickListener {
            val text = view.findViewById<Button>(R.id.button_third).text.toString()
            bundle.putString("MyArg", text)
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
        }
    }
}