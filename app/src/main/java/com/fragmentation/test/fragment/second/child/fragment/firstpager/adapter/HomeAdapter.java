package com.fragmentation.test.fragment.second.child.fragment.firstpager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fragmentation.test.R;
import com.fragmentation.test.fragment.second.child.fragment.firstpager.bean.Article;
import com.fragmentation.test.fragment.second.child.fragment.firstpager.listener.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxyass on 2018/8/18.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private LayoutInflater mInflater;
    private List<Article> mItems = new ArrayList<>();
    private OnItemClickListener mClickListener;

    // 构造
    public HomeAdapter(Context context) {
        this.mInflater = LayoutInflater.from(context);
    }

    // 设置数据
    public void setDatas(List<Article> items) {
        mItems.clear();
        mItems.addAll(items);
    }


    // 创建ViewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_home, parent, false);
        final MyViewHolder holder = new MyViewHolder(view);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                if (mClickListener != null) {
                    mClickListener.onItemClick(position, v, holder);
                }
            }
        });
        return holder;
    }

    // 绑定ViewHolder数据
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Article item = mItems.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvContent.setText(item.getContent());
    }

    // 返回总条目个数
    @Override
    public int getItemCount() {
        return mItems.size();
    }

    // 获取单个对象
    public Article getItem(int position) {
        return mItems.get(position);
    }

    // 创建所需的ViewHolder类
    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTitle;
        private TextView tvContent;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvContent = (TextView) itemView.findViewById(R.id.tv_content);
        }
    }

    // 设置监听
    public void setOnItemClickListener(OnItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }
}
