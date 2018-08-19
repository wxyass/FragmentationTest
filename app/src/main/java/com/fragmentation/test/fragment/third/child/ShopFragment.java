package com.fragmentation.test.fragment.third.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseFragment;
import com.fragmentation.test.base.BaseMainFragment;

/**
 * Created by wxyass on 2018/8/17.
 */

public class ShopFragment extends BaseFragment {

    public static ShopFragment newInstance(){
        Bundle args = new Bundle();
        ShopFragment fragment = new ShopFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third_shop,container,false);
        return view;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        if(findChildFragment(ShopFragment.class)==null){
            // loadRootFragment(R.id.fl_first_container,ZhihuFirstFragment.newInstance());
        }
    }
}
