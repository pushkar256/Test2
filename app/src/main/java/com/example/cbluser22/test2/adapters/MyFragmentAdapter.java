package com.example.cbluser22.test2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.cbluser22.test2.fragments.Fragment1;
import com.example.cbluser22.test2.fragments.Fragment2;
import com.example.cbluser22.test2.fragments.Fragment3;

/**
 * Created by cbluser22 on 6/2/17.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {
    int numOfTabs;
    public MyFragmentAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new Fragment1();
            case 1: return new Fragment2();
            case 2: return  new Fragment3();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }


    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "OVERVIEW";
            case 1:
                return "JOBS";
            case 2:
                return "TESTIMONIAL";
            default:
                return null;

        }
    }
}
