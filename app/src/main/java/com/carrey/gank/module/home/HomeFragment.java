package com.carrey.gank.module.home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carrey.gank.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(getActivity(), R.layout.fragment_main);
//        HomeInfo homeInfo =new HomeInfo("sss","sssssss");
//        viewDataBinding.
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
