package dev.luischang.magicword

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Botón para iniciar el juego
        view.findViewById<Button>(R.id.btn_start_game).setOnClickListener {
            (activity as MainActivity).replaceFragment(GameFragment())
        }

        // Botón para el modo educativo
        view.findViewById<Button>(R.id.btn_educational_mode).setOnClickListener {
            (activity as MainActivity).replaceFragment(EducationalModeFragment())
        }

        // Botón para el modo multijugador
        view.findViewById<Button>(R.id.btn_multiplayer).setOnClickListener {
            (activity as MainActivity).replaceFragment(MultiplayerFragment())
        }

        // Botón para ver el progreso
        view.findViewById<Button>(R.id.btn_view_progress).setOnClickListener {
            (activity as MainActivity).replaceFragment(ProgressFragment())
        }

        return view
    }
}
