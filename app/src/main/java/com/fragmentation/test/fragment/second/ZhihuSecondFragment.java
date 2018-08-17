package com.fragmentation.test.fragment.second;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;
import com.fragmentation.test.fragment.first.ZhihuFirstFragment;
import com.fragmentation.test.fragment.second.child.ViewPagerFragment;

/**
 * Created by wxyass on 2018/8/17.
 */

public class ZhihuSecondFragment extends BaseMainFragment{

    public static ZhihuSecondFragment newInstance(){
        Bundle args = new Bundle();
        ZhihuSecondFragment fragment = new ZhihuSecondFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(ZhihuSecondFragment.class)==null){
            loadRootFragment(R.id.fl_second_container, ViewPagerFragment.newInstance());
        }
    }
}
