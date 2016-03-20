package com.carrey.gank.module.databindingdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewStubProxy;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

import com.carrey.gank.BR;
import com.carrey.gank.R;
import com.carrey.gank.databinding.ActivityDatabindingBinding;
import com.carrey.gank.databinding.ContentMainBinding;
import com.carrey.gank.databinding.ItemHomeInfoBinding;
import com.carrey.gank.module.databindingdemo.domain.HomeInfo;
import com.carrey.gank.module.databindingdemo.domain.ObservabHomeInfo;
import com.carrey.gank.module.databindingdemo.domain.PlainHomeInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carrey on 16/3/20.
 */
public class DataBindingBaseActivity extends AppCompatActivity {

    private ActivityDatabindingBinding binding;
    private ObservabHomeInfo observabHomeInfo = new ObservabHomeInfo();
    private PlainHomeInfo plainHomeInfo = new PlainHomeInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);

        binding.setHomeInfo(new HomeInfo("sss", "12345"));
        binding.setObHomeInfo(observabHomeInfo);

        binding.setPlainHomeInfo(plainHomeInfo); //dataBinding 的基本三种方式


        binding.viewSub.setOnInflateListener(new ViewStub.OnInflateListener() {//viweId  viewStub
            @Override
            public void onInflate(ViewStub viewStub, View view) {
                ContentMainBinding bind = DataBindingUtil.bind(view);
                HomeInfo info = new HomeInfo("", "123456");

                bind.recyclerView.setHasFixedSize(true); //dynamic binding
                bind.recyclerView.setLayoutManager(new LinearLayoutManager(DataBindingBaseActivity.this));
                bind.recyclerView.setAdapter(new HomeAdapter());

                bind.setHome111(info);
                bind.setVariable(BR.homeInfo,info);

            }
        });
        ((ViewStubProxy)binding.viewSub).getViewStub().inflate();

    }



    public void observable(View view) {
        observabHomeInfo.setFirstName(" observableFirstName");
        observabHomeInfo.setLastName(" observableLastName");
    }

    public void planHomeInfo(View view) {
        plainHomeInfo.firstName.set("planFirst");
        plainHomeInfo.lastName.set("planLast");
    }


    private  static class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{

        private List<HomeInfo> list;
        public HomeAdapter() {
            list =new ArrayList<>();
            for (int i = 0; i < 10; i ++) {
                HomeInfo homeInfo= new HomeInfo("xzz"+i, "ssssl");
                list.add(homeInfo);
            }
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_info,null));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.bind(list.get(position));
        }


        @Override
        public int getItemCount() {
            return list.size();
        }


        public static class ViewHolder extends RecyclerView.ViewHolder{

            private ItemHomeInfoBinding binding;

            public ViewHolder(View itemView) {
                super(itemView);

                binding= DataBindingUtil.bind(itemView);
            }

            public void bind(HomeInfo info){
                binding.setHomeInfo(info);
            }
        }
    }

}
