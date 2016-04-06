package com.carrey.gank.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/3/31 16:25
 */

public class RetrofitManager {

    private static RetrofitManager mInstance;
    private Retrofit retrofit;

    public static RetrofitManager getInstance() {
        if (mInstance == null) {
            synchronized (RetrofitManager.class) {
                if (mInstance == null) {
                    mInstance = new RetrofitManager();
                }
            }
        }

        return mInstance;
    }

    private Retrofit build() {
        return new Retrofit.Builder()
                .baseUrl(GankAPI.BaseUrl)
                .client(getClient())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    private OkHttpClient getClient() {
        return new OkHttpClient.Builder()
//                .cache()
//                .addInterceptor()
//                .addNetworkInterceptor()
//                .authenticator()
                .build();
    }

    private RetrofitManager() {
        retrofit = build();
    }

    private Retrofit getRetrofit() {
        if (retrofit == null) {
            synchronized (Retrofit.class) {
                if (retrofit == null) {
                    retrofit = build();
                }
            }
        }
        return retrofit;
    }

    public <T> T create(Class<T> t) {
        return getRetrofit().create(t);
    }
}
