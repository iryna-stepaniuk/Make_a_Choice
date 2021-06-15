package com.example.makeachoice

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import java.util.ArrayList

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
            val listOfMovies : Array<String> = arrayOf("Бойовик", "Детектив", "Драма", "Комедія", "Історичний", "Фентезі")
            val listOfMusic : Array<String> = arrayOf("Поп-музика", "Реп", "Класична", "Техно", "Фанк", "Рок")
            val listOfCountries : Array<String> = arrayOf("Туреччина", "Таїланд", "Чорногорія", "Грузія", "Франція", "Італія")
            val message = when (text) {
                "Жанр фільма" -> listOfMovies.random()
                "Жанр музики" -> listOfMusic.random()
                "Країна для подорожі" -> listOfCountries.random()
                else -> "Choose category"
            }

            val alertDialog = AlertDialog.Builder(context)
            alertDialog.apply {
                setTitle(text)
                setMessage(message)
                setPositiveButton("OK") { _, _ ->
                }
            }.create().show()
            //Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
        view.findViewById<Button>(R.id.button_Return).setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }
    }
}