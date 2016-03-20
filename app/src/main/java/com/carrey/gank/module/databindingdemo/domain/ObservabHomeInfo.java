package com.carrey.gank.module.databindingdemo.domain;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.carrey.gank.BR;

/**
 * Created by carrey on 16/3/20.
 */
public class ObservabHomeInfo extends BaseObservable {

    private String firstName;
    private String lastName;

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }
    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);

    }
}
