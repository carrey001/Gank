package com.carrey.gank;

import android.app.Application;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/4/6 15:23
 */

public class BaseApp extends Application {
    private static BaseApp mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

    public static BaseApp getBaseApp() {
        return mInstance;
    }

}
