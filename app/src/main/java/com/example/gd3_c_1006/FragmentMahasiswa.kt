package com.example.gd3_c_1006

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gd3_c_1006.entity.Mahasiswa

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentMahasiswa.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentMahasiswa : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mahasiswa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(context)
        val adapter : RVMahasiswaAdapter = RVMahasiswaAdapter(Mahasiswa.listOfMahasiswa)

        val rvMahasiswa : RecyclerView = view.findViewById(R.id.rv_mahasiswa)
        rvMahasiswa.layoutManager = layoutManager
        rvMahasiswa.setHasFixedSize(true)
        rvMahasiswa.adapter = adapter
    }
}