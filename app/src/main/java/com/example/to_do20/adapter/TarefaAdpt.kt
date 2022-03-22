package com.example.to_do20.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.to_do20.R
import com.example.to_do20.model.Tarefa

class TarefaAdpt : RecyclerView.Adapter<TarefaAdpt.TarefaViewHolder>() {

    private var ListadeTarefas = emptyList<Tarefa>()

    class TarefaViewHolder (view: View): RecyclerView.ViewHolder(view){

        val textTitulo = view.findViewById<TextView>(R.id.textTitulo)
        val textDescr = view.findViewById<TextView>(R.id.textDescr)
        val textResp = view.findViewById<TextView>(R.id.textResp)
        val textData = view.findViewById<TextView>(R.id.textData)
        val switchCardAtivo = view.findViewById<Switch>(R.id.switchCardAtivo)
        val textCat = view.findViewById<TextView>(R.id.textCat)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_layouttt, parent, false)

            return TarefaViewHolder(layout)
    }

            override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {

                val tarefa = ListadeTarefas[position]
                holder.textTitulo.text = tarefa.titulo
                holder.textDescr.text = tarefa.descricao
                holder.textResp.text = tarefa.resposavel
                holder.textData.text = tarefa.data
                holder.switchCardAtivo.isChecked = tarefa.status
                holder.textCat.text = tarefa.categoria

            }

    override fun getItemCount(): Int {
    return ListadeTarefas.size

    }

    fun setLista(Lista: List<Tarefa>){
        ListadeTarefas = Lista
        notifyDataSetChanged()

    }
}