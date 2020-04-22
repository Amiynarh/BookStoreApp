package com.example.bitamirshafiee.bookstoreskeleton

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class MyPageAdapter(fn: FragmentManager):FragmentPagerAdapter(fn){
    val pageNumber=3
    override fun getItem(position: Int): Fragment {
        return when(position){
            0->firstFragment()
            1->fragmentTwo()
            2->thirdFragment()
            else->firstFragment()
        }

    }

    override fun getCount(): Int {
     return pageNumber
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"top"
            1->"children"
            2->"friction"
            else->"top"
        }
    }
}