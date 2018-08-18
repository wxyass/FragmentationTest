package com.fragmentation.test.fragment.first.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;

/**
 * 第一个导航页的子Fragment
 *
 * Created by wxyass on 2018/8/17.
 */

public class FirstHomeFragment extends BaseMainFragment{

    public static FirstHomeFragment newInstance(){
        Bundle args = new Bundle();
        FirstHomeFragment fragment = new FirstHomeFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first_home,container,false);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(FirstHomeFragment.class)==null){
            // loadRootFragment(R.id.fl_first_container,ZhihuFirstFragment.newInstance());
        }
    }
}
