package com.example.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class mPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public mPagerAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    public mPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new ChatFragment();
            case 1:
                return new StatusFragment();
            case 2:
                return new CallsFragment();
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return numOfTabs;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        switch (position){

            case 0:
                return title = "Chat";
            case 1:
                return title = "Status";
            case 2:
                return title = "Calls";
            default:
                return null;
        }
    }
}
