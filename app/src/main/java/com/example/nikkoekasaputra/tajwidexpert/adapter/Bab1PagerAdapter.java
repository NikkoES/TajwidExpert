package com.example.nikkoekasaputra.tajwidexpert.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nikkoekasaputra.tajwidexpert.fragment.bab1.*;

public class Bab1PagerAdapter extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2", "Tab 3"
    };

    public Bab1PagerAdapter(FragmentManager fm) {
        super(fm);
        //menerima string array, nd trigger
        //string array untuk title
        //trigger untuk pengecekan item tab
    }

    //method ini yang akan memanipulasi penampilan Fragment dilayar
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new DefinisiFragment();
                break;
            case 1:
                fragment = new DasarHukumFragment();
                break;
            case 2:
                fragment = new DasarHukumFragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}