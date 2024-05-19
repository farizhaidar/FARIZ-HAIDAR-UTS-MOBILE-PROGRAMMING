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
            Data(R.drawable.sakitperut, "Sakit Perut", "saya sakit perut."),
            Data(R.drawable.patrick, "Patrick Ketahuan", "Patrick ketahuan mencuri krabby patty."),
            Data(R.drawable.emyu, "Manchester United", "Manchester United klub terbaik di dunia."),
            Data(R.drawable.mail, "Ayam Goreng Mail", "Ayam goreng mail memasuki makanan terenak di dunia nomor berapa ya?."),
            Data(R.drawable.fizi, "Fizi Menangis", "Fizi menangis di tinggal intan bayong"),
            Data(R.drawable.pogba, "Pogba", "pogba midfielder terbaik di dunia(kalo ga kena doping sama males)."),
            Data(R.drawable.arhan, "Arhan", "lah itu si arhan lempar bola nyampe mana?."),
            Data(R.drawable.anthony, "Anthony", "WIH SERAMNYA INI PEMAIN"),
            Data(R.drawable.kakros, "Kak Ros", "Kak Ros kepeleset gara2 kepala upin di jadiin pelan"),
            Data(R.drawable.emyu, "Manchester United", "sekali lagi Manchester United adalah klub terbaik di dunia.")
        )

        newsAdapter = NewsAdapter(requireContext(), newsList)
        newsListView.adapter = newsAdapter

        return view
    }
}