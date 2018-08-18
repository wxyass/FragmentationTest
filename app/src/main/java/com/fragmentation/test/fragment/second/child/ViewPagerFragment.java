package com.fragmentation.test.fragment.second.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;
import com.fragmentation.test.fragment.second.child.adatpter.ZhihuPagerFragmentAdapter;

/**
 * Created by wxyass on 2018/8/17.
 */

public class ViewPagerFragment extends BaseMainFragment{

    private TabLayout mTab;
    private ViewPager mViewPager;

    public static ViewPagerFragment newInstance(){
        Bundle args = new Bundle();
        ViewPagerFragment fragment = new ViewPagerFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_pager,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mTab = (TabLayout)view.findViewById(R.id.tab);
        mViewPager = (ViewPager)view.findViewById(R.id.viewPager);

        mTab.addTab(mTab.newTab());
        mTab.addTab(mTab.newTab());
        mTab.addTab(mTab.newTab());

        mViewPager.setAdapter(new ZhihuPagerFragmentAdapter(getChildFragmentManager(),
                "新闻","最热","最爱","更多"));
        mTab.setupWithViewPager(mViewPager);

    }

}
