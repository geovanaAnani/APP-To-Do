package com.example.to_do20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do20.adapter.TarefaAdpt
import com.example.to_do20.model.Tarefa

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment



        val listadTarefas = mutableListOf(
            Tarefa("Passar pano na casa",
                "Executar na parte da tarde.",
                "Juliana",
                "22/03/2022",
                true,
                "Dia a Dia"
            ),
            Tarefa("Comprar comida do Galileu",
                "Executar na parte da manhã.",
                "Daiana",
                "23/03/2022",
                false,
                "Urgente"
            ),
            Tarefa("Finalizar curso online!",
                "Estudar na parte da noite",
                "Geovana",
                "21/03/2022",
                true,
                "Dia a Dia"
            )
        )


        val recyclerTaref = requireView().findViewById<RecyclerView>(R.id.listFragment)
        val adapter = TarefaAdpt()

        recyclerTaref.layoutManager = LinearLayoutManager(context)
        recyclerTaref.adapter = adapter
        recyclerTaref.setHasFixedSize(true)
        adapter.setLista(listadTarefas)



        val view = inflater.inflate(R.layout.fragment_list, container, false)

        return view


    }


}