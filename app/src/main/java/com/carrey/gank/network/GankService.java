package com.carrey.gank.network;

import com.carrey.gank.DayInfo;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/3/31 16:04
 */

public interface GankService {
//    @GET("data/sk/{city}.html")
//    Observable<Weather> getWeather1(@Path("city") String city);


    /**
     * //    分类数据: http://gank.io/api/data/数据类型/请求个数/第几页
     * //
     * //    数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     * // http://gank.io/api/data/Android/10/1
     * //    http://gank.io/api/data/福利/10/1
     * //    http://gank.io/api/data/iOS/20/2
     * //    http://gank.io/api/data/all/20/2
     * //    每日数据： http://gank.io/api/day/年/月/日
     */
    @GET("data/{category}/{pageSize}/{pageCount}")
    Observable<DayInfo> getCategoryData(@Path("category") String category, @Path("pageSize") String pageSize,
                                        @Path("pageCount") String pageCount);

    /**
     * 获取每日数据
     * http://gank.io/api/day/2015/08/06
     */
    @GET("day/{year}/{month}/{day}")
    Observable<DayInfo> getDayData(@Path("year") String year, @Path("month") String month, @Path("day") String day);

    /**
     * 获取每日数据
     * 数据类型：福利 | Android | iOS | 休息视频 | 拓展资源 | 前端
     * 个数： 数字，大于0
     * 例：
     * http://gank.io/api/random/data/Android/20
     */
    @GET("random/data/{category}/{pageSize}")
    Observable<DayInfo> geRandomData(@Path("category") String category, @Path("pageSize") String pageSize);
}
