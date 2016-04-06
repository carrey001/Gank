package com.carrey.gank;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.carrey.gank.databinding.ItemHomeBinding;
import com.carrey.gank.databinding.MainItem;
import com.carrey.gank.network.Category;
import com.carrey.gank.network.GankService;
import com.carrey.gank.network.RetrofitManager;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private MainItem mainBinding;
    private int PageCount = 1;
    private String pageSize = "20";

    private List<SexGirl.SexGirlEntity> data = new ArrayList<>();
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myAdapter = new MyAdapter();
        mainBinding.recycleView.setLayoutManager(new StaggeredGridLayoutManager(3, OrientationHelper.VERTICAL));
        mainBinding.recycleView.setAdapter(myAdapter);
        loadData();
    }

    private void loadData() {

        RetrofitManager.getInstance().create(GankService.class)
                .getCategoryData(Category.YELLOPNG.category, pageSize, PageCount)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<SexGirl>() {
                    @Override
                    public void call(SexGirl sexGirl) {
                        data.addAll(sexGirl.results);
                        myAdapter.notifyDataSetChanged();
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {

                    }
                });

    }

//    public void planHomeInfo(View view) {
//        RetrofitManager.getInstance().create(GankService.class)
//                .getDayData("2016", "3", "31")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnSubscribe(new Action0() {
//                    @Override
//                    public void call() {
//
//                    }
//                })
//                .subscribe(new Action1<DayInfo>() {
//                    @Override
//                    public void call(DayInfo weather) {
//                        System.out.println(weather.toString());
//                    }
//                }, new Action1<Throwable>() {
//                    @Override
//                    public void call(Throwable throwable) {
//
//                    }
//                });
//    }

    class MyAdapter extends RecyclerView.Adapter<ViewHolder> {


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(MainActivity.this).inflate(R.layout.item_home, null, false));
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.bindData(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ItemHomeBinding bind;

        public ViewHolder(View itemView) {
            super(itemView);
            bind = DataBindingUtil.bind(itemView);
        }

        public void bindData(SexGirl.SexGirlEntity sexGirlEntity) {
            bind.setSex(sexGirlEntity);
        }
    }

    @BindingAdapter({"bind:image"})
    public static void imageLoader(ImageView imageView, String url) {
        Glide.with(BaseApp.getBaseApp()).load(url).into(imageView);
    }
}
