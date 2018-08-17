package com.fragmentation.test.fragment.second.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;

/**
 * Created by wxyass on 2018/8/17.
 */

public class ViewPagerFragment extends BaseMainFragment{

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
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(ViewPagerFragment.class)==null){
            // loadRootFragment(R.id.fl_first_container,ZhihuFirstFragment.newInstance());
        }
    }
}
