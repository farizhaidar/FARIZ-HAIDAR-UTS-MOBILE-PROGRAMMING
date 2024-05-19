package com.farizz.utsss

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import androidx.fragment.app.Fragment

class BeritaFragment : Fragment() {

    private lateinit var newsListView: ListView
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_berita, container, false)

        newsListView = view.findViewById(R.id.listView)

        // Dummy data
        val newsList = listOf(
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),
            Data(R.drawable.paris, "Orang hilang!", "!!."),



            )

        newsAdapter = NewsAdapter(requireContext(), newsList)
        newsListView.adapter = newsAdapter

        return view
    }
}