package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.mTabLayout);
        TabItem tabChat = findViewById(R.id.tabChats);
        TabItem tabStatus = findViewById(R.id.tabStatus);
        TabItem tabCalls = findViewById(R.id.tabCalls);

        ViewPager viewPager = findViewById(R.id.mViewPager);

        mPagerAdapter pagerAdapter = new mPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}