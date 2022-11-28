package pl.edu.uwr.lista_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class ListAdapter : RecyclerView.Adapter<ListAdapter.ViewHolder>(){


    private val moduleList = DataProvider.modules

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val moduleTitleTextView: TextView = view.findViewById(R.id.crime_item)
        private val imageOfSolved: ImageView = view.findViewById(R.id.theImage)


        fun bind(item: Module){
            moduleTitleTextView.text = item.name
            //if sovled, show the image

            if(!item.crimeName.solved)
                imageOfSolved.visibility = View.INVISIBLE
            else
                imageOfSolved.visibility = View.VISIBLE
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = moduleList[position]
        println(moduleList)
        holder.bind(item)
        holder.itemView.setOnClickListener {
            holder.itemView.findNavController().navigate(
                ListFragmentDirections.actionListFragmentToDetailFragment(
                    moduleId = item.id
                )
            )
        }
    }

    override fun getItemCount(): Int = moduleList.size
}