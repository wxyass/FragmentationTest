package com.fragmentation.test.fragment.second.child.adatpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fragmentation.test.fragment.second.child.fragment.FirstPagerFragment;
import com.fragmentation.test.fragment.second.child.fragment.OtherPagerFragment;

/**
 * Created by wxyass on 2018/8/18.
 */

public class ZhihuPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTitles;

    public ZhihuPagerFragmentAdapter(FragmentManager fm, String... titles) {
        super(fm);
        mTitles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return FirstPagerFragment.newInstance();
        } else {
            return OtherPagerFragment.newInstance(mTitles[position]);
        }
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
