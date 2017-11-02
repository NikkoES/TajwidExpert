package com.example.nikkoekasaputra.tajwidexpert.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.nikkoekasaputra.tajwidexpert.fragment.bab1.DasarHukumFragment;
import com.example.nikkoekasaputra.tajwidexpert.fragment.bab1.DefinisiFragment;

public class Bab2PagerAdapter extends FragmentPagerAdapter {
    //nama tab nya
    String[] title = new String[]{
            "Tab 1", "Tab 2", "Tab 3"
    };

    public Bab2PagerAdapter(FragmentManager fm) {
        super(fm);
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