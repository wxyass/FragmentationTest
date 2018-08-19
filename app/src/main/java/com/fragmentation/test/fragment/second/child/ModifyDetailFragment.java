package com.fragmentation.test.fragment.second.child;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fragmentation.test.R;
import com.fragmentation.test.base.BaseFragment;

/**
 * Created by wxyass on 2018/8/19.
 */

public class ModifyDetailFragment extends BaseFragment{

    private static final String ARG_TITLE = "arg_title";

    private Toolbar mToolbar;
    private EditText mEtModiyTitle;
    private Button mBtnModify, mBtnNext;

    private String mTitle;

    public static ModifyDetailFragment newInstance(String title){
        Bundle bundle = new Bundle();
        ModifyDetailFragment fragment = new ModifyDetailFragment();
        bundle.putString(ARG_TITLE,title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if(bundle!=null){
            mTitle = bundle.getString(ARG_TITLE);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view = inflater.inflate(R.layout.fragment_modify_detail,container,false);
        initView(view);

        return view;
    }

    private void initView(View view) {
        mToolbar = (Toolbar) view.findViewById(R.id.toolbar);
        mEtModiyTitle = (EditText) view.findViewById(R.id.et_modify_title);
        mBtnModify = (Button) view.findViewById(R.id.btn_modify);
        mBtnNext = (Button) view.findViewById(R.id.btn_next);

        mToolbar.setTitle("测试startForResult");
        initToolbarNav(mToolbar);

        mEtModiyTitle.setText(mTitle);

        mBtnModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(DetailFragment.KEY_RESULT_TITLE,mEtModiyTitle.getText().toString().trim());
                setFragmentResult(RESULT_OK,bundle);
                Toast.makeText(_mActivity, "修改成功!", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                Toast.makeText(_mActivity, "CycleFragment", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onSupportInvisible() {
        super.onSupportInvisible();
        hideSoftInput();
    }
}
