package com.fragmentation.test.fragment.third;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;
import com.fragmentation.test.fragment.first.ZhihuFirstFragment;
import com.fragmentation.test.fragment.third.child.ShopFragment;

/**
 * 第三个导航页
 *
 * Created by wxyass on 2018/8/17.
 */
public class ZhihuThirdFragment extends BaseMainFragment{

    public static ZhihuThirdFragment newInstance(){
        Bundle args = new Bundle();
        ZhihuThirdFragment fragment = new ZhihuThirdFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third,container,false);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(ZhihuThirdFragment.class)==null){
            loadRootFragment(R.id.fl_third_container, ShopFragment.newInstance());
        }
    }
}
