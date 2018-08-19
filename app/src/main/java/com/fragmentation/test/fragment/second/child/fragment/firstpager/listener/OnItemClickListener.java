package com.fragmentation.test.fragment.second.child.fragment.firstpager.listener;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by wxyass on 2018/8/19.
 */
public interface OnItemClickListener {
    void onItemClick(int positon, View view, RecyclerView.ViewHolder vh);
}
