package com.carrey.gank.module.databindingdemo.domain;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by carrey on 16/3/20.
 */
public class PlainHomeInfo {

    public final ObservableField<String> firstName=new ObservableField<>();
    public final ObservableField<String> lastName=new ObservableField<>();
    public final ObservableInt age =new ObservableInt();

 }
