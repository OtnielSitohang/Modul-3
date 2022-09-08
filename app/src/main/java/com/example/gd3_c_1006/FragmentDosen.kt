package com.example.gd3_c_1006

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_1006.entity.Dosen

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentDosen.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentDosen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dosen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        val adapter: RVDosenAdapter = RVDosenAdapter(Dosen.listofDosen)

        val rvDosen : RecyclerView = view.findViewById(R.id.rv_dosen)
        rvDosen.layoutManager = layoutManager
        rvDosen.setHasFixedSize(true)
        rvDosen.adapter = adapter
    }
}