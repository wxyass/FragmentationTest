package com.fragmentation.test.fragment.second.child.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;

/**
 *
 *
 * Created by wxyass on 2018/8/17.
 */

public class FirstPagerFragment extends BaseMainFragment{


    public static FirstPagerFragment newInstance(){
        Bundle args = new Bundle();
        FirstPagerFragment fragment = new FirstPagerFragment();
        fragment.setArguments(args);
        return fragment;

    }



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_pager_first,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }


}
