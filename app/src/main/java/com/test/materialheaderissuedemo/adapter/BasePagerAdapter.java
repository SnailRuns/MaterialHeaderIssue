package com.test.materialheaderissuedemo.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.ViewGroup;

import com.test.materialheaderissuedemo.fragment.CommonFragment;

public class BasePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String titls[];

    public BasePagerAdapter(Context context, FragmentManager fm, String[] titls) {
        super(fm);
        mContext = context;
        this.titls = titls;

    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        super.setPrimaryItem(container, position, object);
    }

    @Override
    public Fragment getItem(int position) {
        return new CommonFragment();
    }

    @Override
    public int getCount() {
        return titls.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titls[position];
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

}
