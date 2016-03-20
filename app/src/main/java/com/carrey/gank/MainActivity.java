package com.carrey.gank;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.carrey.gank.module.databindingdemo.DataBindingBaseActivity;
import com.carrey.gank.module.databindingdemo.domain.ObservabHomeInfo;
import com.carrey.gank.module.databindingdemo.domain.PlainHomeInfo;

public class MainActivity extends AppCompatActivity {

    private ObservabHomeInfo observabHomeInfo = new ObservabHomeInfo();
    private PlainHomeInfo plainHomeInfo = new PlainHomeInfo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
//
//        dataBinding.setHomeInfo(new HomeInfo("commonFirst", "commonLast"));
//        dataBinding.setObHomeInfo(observabHomeInfo);
//        dataBinding.setPlainHomeInfo(plainHomeInfo);
//        dataBinding.observable.setText("observable111");
////        dataBinding.viewSub.setLayoutResource(R.layout.content_main);
//        dataBinding.viewSub.setOnInflateListener(new ViewStub.OnInflateListener() {
//            @Override
//            public void onInflate(ViewStub viewStub, View view) {
//                ContentMainBinding bind = DataBindingUtil.bind(view);
//                HomeInfo info = new HomeInfo("", "123456");
//                bind.recyclerView.setHasFixedSize(true);
//                bind.recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//                bind.recyclerView.setAdapter(new HomeAdapter());
//                bind.setHome111(info);
//                bind.setVariable(BR.homeInfo,info);
//
//            }
//        });
//        ((ViewStubProxy)dataBinding.viewSub).getViewStub().inflate();

//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//         Inflate the menu; this adds items to the action bar if it is present.
//        return true;
//    }
//
    public void observable(View view) {
        startActivity(new Intent(this, DataBindingBaseActivity.class));
//        observabHomeInfo.setFirstName(" observableFirstName");
//        observabHomeInfo.setLastName(" observableLastName");
    }

    public void planHomeInfo(View view) {
//        plainHomeInfo.firstName.set("planFirst");
//        plainHomeInfo.lastName.set("planLast");
    }

//
//    private  static class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
//
//        private List<HomeInfo> list;
//        public HomeAdapter() {
//            list =new ArrayList<>();
//            for (int i = 0; i < 10; i ++) {
//                HomeInfo homeInfo= new HomeInfo("xzz"+i, "ssssl");
//                list.add(homeInfo);
//            }
//        }
//
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_info,null));
//        }
//
//        @Override
//        public void onBindViewHolder(ViewHolder holder, int position) {
//                    holder.bind(list.get(position));
//        }
//
//
//        @Override
//        public int getItemCount() {
//            return list.size();
//        }
//
//
//      public static class ViewHolder extends RecyclerView.ViewHolder{
//
//          private ItemHomeInfoBinding binding;
//
//            public ViewHolder(View itemView) {
//                super(itemView);
//
//              binding= DataBindingUtil.bind(itemView);
//            }
//
//          public void bind(HomeInfo info){
//              binding.setHomeInfo(info);
//          }
//        }
//    }

}
