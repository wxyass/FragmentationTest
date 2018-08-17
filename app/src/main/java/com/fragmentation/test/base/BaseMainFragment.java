package com.fragmentation.test.base;

import android.content.Context;

import com.fragmentation.test.fragment.first.ZhihuFirstFragment;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by wxyass on 2018/8/17.
 */

public class BaseMainFragment extends SupportFragment {
    protected OnBackToFirstListener _mBackToFirstListener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnBackToFirstListener) {
            _mBackToFirstListener = (OnBackToFirstListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnBackToFirstListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        _mBackToFirstListener = null;
    }

    // 对返回键进行监听
    @Override
    public boolean onBackPressedSupport() {
        // 在栈中的Fragment个数大于1
        if(getChildFragmentManager().getBackStackEntryCount()>1){
            popChild();
        }else{
            // 当这个Fragment是第一个导航页,直接退出
            if(this instanceof ZhihuFirstFragment){
                _mActivity.finish();
            }else{
                // 返回到第一个导航页
                _mBackToFirstListener.OnBackToFirstFragment();
            }
        }
        return true;
    }

    public interface OnBackToFirstListener {
        void OnBackToFirstFragment();
    }
}
