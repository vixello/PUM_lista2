package pl.edu.uwr.lista_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter(private val institutes: ArrayList<Crimes>) : RecyclerView.Adapter<DetailAdapter.ViewHolder>() {



    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        private val titleTextView: TextView = view.findViewById(R.id.crimeTitleDetail)
        private val infoTextView: TextView = view.findViewById(R.id.infoTextDetail)
        private val indeksTextView: TextView = view.findViewById(R.id.indeksStudent)

        fun bind(textCurrent: Crimes){
            infoTextView.text = textCurrent.info
            titleTextView.text = textCurrent.title
            indeksTextView.text = "Student:  ${textCurrent.indeks}"

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_view_detail, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = institutes[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = 1
}

