package com.carrey.gank;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.carrey.gank.module.Weather;
import com.carrey.gank.module.databindingdemo.DataBindingBaseActivity;
import com.carrey.gank.module.databindingdemo.domain.ObservabHomeInfo;
import com.carrey.gank.module.databindingdemo.domain.PlainHomeInfo;
import com.carrey.gank.network.GankAPI;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private ObservabHomeInfo observabHomeInfo = new ObservabHomeInfo();
    private PlainHomeInfo plainHomeInfo = new PlainHomeInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void observable(View view) {
        startActivity(new Intent(this, DataBindingBaseActivity.class));
    }

    public void planHomeInfo(View view) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.weather.com.cn/")
//                .baseUrl("https://gank.io/data/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GankAPI service = retrofit.create(GankAPI.class);


        Observable<Weather> weather1 = service.getWeather1("101010100");
        weather1.subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .doOnSubscribe(new Action0() {
            @Override
            public void call() {

            }
        })
        .subscribe(new Action1<Weather>() {
            @Override
            public void call(Weather weather) {
                System.out.println(weather.toString());
            }
        }, new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {

            }
        });

//        Call<Weather> weather = service.getWeather("101010100");
//        weather.enqueue(new Callback<Weather>() {
//            @Override
//            public void onResponse(Call<Weather> call, Response<Weather> response) {
//                System.out.println(response.toString());
//                System.out.println(response.body().toString());
//            }
//
//            @Override
//            public void onFailure(Call<Weather> call, Throwable t) {
//
//            }
//
//
//        });
//        Call fuli = service.getFuli("20", "1");

//        fuli.enqueue(new Callback<HomeBean>() {
//            @Override
//            public void onResponse(Call<HomeBean> call, Response<HomeBean> response) {
//                    System.out.println(response.errorBody());
//                    System.out.println(response.code());
//                    System.out.println(response.toString());
//            }
//
//            @Override
//            public void onFailure(Call call, Throwable t) {
//
//            }
//        });

//
//        try {
//            fuli.execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        fuli.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//
//                System.out.println(response.toString());
//            }
//
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//
//            }
//        });

    }
}
