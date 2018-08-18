package com.fragmentation.test.fragment.second.child.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseMainFragment;
import com.fragmentation.test.fragment.second.child.ViewPagerFragment;

/**
 *
 *
 * Created by wxyass on 2018/8/17.
 */

public class OtherPagerFragment extends BaseMainFragment{
    private static final String ARG_TYPE = "arg_type";

    private String mTitle;

    public static OtherPagerFragment newInstance(String title){
        Bundle args = new Bundle();
        args.putString(ARG_TYPE,title);
        OtherPagerFragment fragment = new OtherPagerFragment();
        fragment.setArguments(args);
        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTitle = getArguments().getString(ARG_TYPE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_pager_other,container,false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        TextView textView = (TextView)view.findViewById(R.id.tv_title);
        textView.setText(mTitle);
    }


}
