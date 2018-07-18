package com.example.fahadkhanashrafi.naukriapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Fahad Khan Ashrafi on 10/6/2017.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        switch (position) {
            case 0:
                fragment = new TabFragment1();
                break;
            case 1:
                fragment= new TabFragment2();
                break;
            case 2:
                fragment = new TabFragment3();
                break;
            default:
        }
        return fragment;

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
