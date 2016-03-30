package com.carrey.gank.network;

import com.carrey.gank.module.Weather;
import com.carrey.gank.module.home.HomeBean;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by carrey on 16/3/19.
 */
public interface GankAPI {

//    public String Home="/home";
//    http://gank.io/api/data/%E7%A6%8F%E5%88%A9/20/1
    @GET("%E7%A6%8F%E5%88%A9/{pageSize}/{pageCount}")
    Call<Response<HomeBean>> getFuli(@Path("pageSize")String pageSize,@Path("pageCount")String pageCount);
//    http://www.weather.com.cn/data/sk/101010100.html
    @GET("data/sk/{city}.html")
    Call<Weather>  getWeather(@Path("city") String city);

    @GET("data/sk/{city}.html")
    Observable<Weather> getWeather1(@Path("city") String city);
}
