package pl.edu.uwr.lista_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailFragment:  Fragment() {


    private val moduleId by lazy {
        arguments?.getInt("moduleId")?:
        throw IllegalArgumentException("moduleId doesn't exist")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val activity: AppCompatActivity = activity as AppCompatActivity
        activity.supportActionBar?.title = DataProvider.modules[moduleId].name
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.detailRecyclerView)
        recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = DetailAdapter(arrayListOf(DataProvider.modules[moduleId].crimeName,DataProvider.modules[moduleId].crimeName))
        }
    }

}