package com.fragmentation.test.fragment.fourth;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;
import com.fragmentation.test.fragment.first.ZhihuFirstFragment;
import com.fragmentation.test.fragment.fourth.child.MeFragment;

/**
 * 第4四导航页
 *
 * Created by wxyass on 2018/8/17.
 */

public class ZhihuFourthFragment extends BaseMainFragment{

    public static ZhihuFourthFragment newInstance(){
        Bundle args = new Bundle();
        ZhihuFourthFragment fragment = new ZhihuFourthFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth,container,false);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(ZhihuFourthFragment.class)==null){
            loadRootFragment(R.id.fl_fourth_container, MeFragment.newInstance());
        }
    }
}
