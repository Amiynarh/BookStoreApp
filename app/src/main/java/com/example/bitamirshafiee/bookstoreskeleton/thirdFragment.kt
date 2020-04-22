package com.example.bitamirshafiee.bookstoreskeleton

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * A simple [Fragment] subclass.
 */
class thirdFragment : Fragment() {
private var fictionList:MutableList<Int> = mutableListOf(
    R.drawable.fiction_one, R.drawable.fiction_two ,
    R.drawable.fiction_three,R.drawable.fiction_four,
    R.drawable.fiction_five, R.drawable.fiction_six,
    R.drawable.fiction_seven, R.drawable.fiction_eight,
    R.drawable.fiction_nine, R.drawable.fiction_ten,
    R.drawable.fiction_one, R.drawable.fiction_two ,
    R.drawable.fiction_three,R.drawable.fiction_four,
    R.drawable.fiction_five, R.drawable.fiction_six,
    R.drawable.fiction_seven, R.drawable.fiction_eight,
    R.drawable.fiction_nine, R.drawable.fiction_ten
)
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:RecyclerViewAdapter
    private lateinit var layout:StaggeredGridLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.third_fragment, container, false)
        recyclerView=view.findViewById(R.id.recycler_view_2)
        adapter= RecyclerViewAdapter(fictionList)
        recyclerView.adapter=adapter
        layout= StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager=layout

        return view
    }

}
