package com.example.whatsapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder

/**
 * A simple [Fragment] subclass.
 */
class StatusFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val adapter = GroupAdapter<ViewHolder>()
        adapter.add(LogAdapter())
        return inflater.inflate(R.layout.fragment_status, container, false)
    }



}
