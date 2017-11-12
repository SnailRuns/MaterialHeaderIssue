package com.test.materialheaderissuedemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.test.materialheaderissuedemo.adapter.BasePagerAdapter;


public class MainActivity extends AppCompatActivity {
    private TabLayout tab;
    private ViewPager viewPager;
    private BasePagerAdapter pagerAdapter;
    String[] titls = new String[]{"tab1", "tab2", "tab3", "tab4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tab = (TabLayout) findViewById(R.id.tab);
        pagerAdapter = new BasePagerAdapter(this, getSupportFragmentManager(), titls);
        viewPager.setAdapter(pagerAdapter);
        tab.setupWithViewPager(viewPager);
    }

}
