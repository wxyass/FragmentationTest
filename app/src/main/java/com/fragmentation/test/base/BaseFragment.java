package com.fragmentation.test.base;

import android.support.v7.widget.Toolbar;
import android.view.View;

import com.fragmentation.test.R;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by wxyass on 2018/8/18.
 */

public class BaseFragment extends SupportFragment {
    protected void initToolbarNav(Toolbar toolbar){
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mActivity.onBackPressed();
            }
        });
    }
}
