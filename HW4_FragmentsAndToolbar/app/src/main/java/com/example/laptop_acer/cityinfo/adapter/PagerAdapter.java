package com.example.laptop_acer.cityinfo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.laptop_acer.cityinfo.fragments.BurgasFragment;
import com.example.laptop_acer.cityinfo.fragments.SozopolFragment;
import com.example.laptop_acer.cityinfo.fragments.VratsaFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private int numOfTabs;

    public PagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BurgasFragment burgasFragment = new BurgasFragment();
                return burgasFragment;
            case 1:
                SozopolFragment sozopolFragment = new SozopolFragment();
                return sozopolFragment;
            case 2:
                VratsaFragment vratsaFragment = new VratsaFragment();
                return vratsaFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
