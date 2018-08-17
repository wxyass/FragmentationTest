package com.fragmentation.test;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

/**
 * Created by wxyass on 2018/8/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // 建议在Application里初始化
        Fragmentation.builder()
                // BUBBLE显示悬浮球 ; SHAKE: 摇一摇唤出 ;  NONE：隐藏
                .stackViewMode(Fragmentation.BUBBLE)
                .debug(BuildConfig.DEBUG)
                .install();

    }
}
