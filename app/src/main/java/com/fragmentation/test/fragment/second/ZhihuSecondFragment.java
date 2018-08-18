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
 * 第二个导航页
 *
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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(findChildFragment(ZhihuSecondFragment.class)==null){
            loadRootFragment(R.id.fl_second_container, ViewPagerFragment.newInstance());
        }
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        // 这里可以不用懒加载,因为Adapter的场景下,Adapter内的子Fragment只有在父Fragment是show状态时,才会被Attach,Create
    }
}
