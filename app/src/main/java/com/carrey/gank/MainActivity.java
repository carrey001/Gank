package com.carrey.gank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.carrey.gank.network.GankService;
import com.carrey.gank.network.RetrofitManager;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void planHomeInfo(View view) {
        RetrofitManager.getInstance().create(GankService.class)
                .getDayData("2016", "3", "31")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {

                    }
                })
                .subscribe(new Action1<DayInfo>() {
                    @Override
                    public void call(DayInfo weather) {
                        System.out.println(weather.toString());
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });
    }

}
