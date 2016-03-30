package com.carrey.gank.module;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/3/30 16:23
 */

public class Weather {

    /**
     * city : 北京
     * city_en : beijing
     * date_y : 2012年2月16日
     * date :
     * week : 星期四
     * fchh : 11
     * cityid : 101010100
     * temp1 : 2℃~-7℃
     * temp2 : 1℃~-7℃
     * temp3 : 4℃~-7℃
     * temp4 : 7℃~-5℃
     * temp5 : 5℃~-3℃
     * temp6 : 5℃~-2℃
     * weather1 : 晴
     * weather2 : 晴
     * weather3 : 晴
     * weather4 : 晴转多云
     * weather5 : 多云
     * weather6 : 多云转阴
     * img1 : 0
     * img2 : 99
     * img3 : 0
     * img4 : 99
     * img5 : 0
     * img6 : 99
     * img7 : 0
     * img8 : 1
     * img9 : 1
     * img10 : 99
     * img11 : 1
     * img12 : 2
     * img_single : 0
     * img_title1 : 晴
     * img_title2 : 晴
     * img_title3 : 晴
     * img_title4 : 晴
     * img_title5 : 晴
     * img_title6 : 晴
     * img_title7 : 晴
     * img_title8 : 多云
     * img_title9 : 多云
     * img_title10 : 多云
     * img_title11 : 多云
     * img_title12 : 阴
     * img_title_single : 晴
     * wind1 : 北风3-4级转微风
     * wind2 : 微风
     * wind3 : 微风
     * wind4 : 微风
     * wind5 : 微风
     * wind6 : 微风
     * fx1 : 北风
     * fx2 : 微风
     * fl1 : 3-4级转小于3级
     * fl2 : 小于3级
     * fl3 : 小于3级
     * fl4 : 小于3级
     * fl5 : 小于3级
     * fl6 : 小于3级
     * index : 冷
     * index_d : 天气冷，建议着棉衣、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣或冬大衣。
     * index48 : 冷
     * index48_d : 天气冷，建议着棉衣、皮夹克加羊毛衫等冬季服装。年老体弱者宜着厚棉衣或冬大衣。
     * index_uv : 弱
     * index48_uv : 弱
     * index_xc : 适宜
     * index_tr : 一般
     * index_co : 较不舒适
     * st1 : 1
     * st2 : -8
     * st3 : 2
     * st4 : -4
     * st5 : 5
     * st6 : -5
     * index_cl : 较不宜
     * index_ag : 极不易发
     */

    public WeatherinfoEntity weatherinfo;

    public static class WeatherinfoEntity {
        @Override
        public String toString() {
            return "WeatherinfoEntity{" +
                    "city='" + city + '\'' +
                    ", city_en='" + city_en + '\'' +
                    ", date_y='" + date_y + '\'' +
                    ", date='" + date + '\'' +
                    ", week='" + week + '\'' +
                    ", fchh='" + fchh + '\'' +
                    ", cityid='" + cityid + '\'' +
                    ", temp1='" + temp1 + '\'' +
                    ", temp2='" + temp2 + '\'' +
                    ", temp3='" + temp3 + '\'' +
                    ", temp4='" + temp4 + '\'' +
                    ", temp5='" + temp5 + '\'' +
                    ", temp6='" + temp6 + '\'' +
                    ", weather1='" + weather1 + '\'' +
                    ", weather2='" + weather2 + '\'' +
                    ", weather3='" + weather3 + '\'' +
                    ", weather4='" + weather4 + '\'' +
                    ", weather5='" + weather5 + '\'' +
                    ", weather6='" + weather6 + '\'' +
                    ", img1='" + img1 + '\'' +
                    ", img2='" + img2 + '\'' +
                    ", img3='" + img3 + '\'' +
                    ", img4='" + img4 + '\'' +
                    ", img5='" + img5 + '\'' +
                    ", img6='" + img6 + '\'' +
                    ", img7='" + img7 + '\'' +
                    ", img8='" + img8 + '\'' +
                    ", img9='" + img9 + '\'' +
                    ", img10='" + img10 + '\'' +
                    ", img11='" + img11 + '\'' +
                    ", img12='" + img12 + '\'' +
                    ", img_single='" + img_single + '\'' +
                    ", img_title1='" + img_title1 + '\'' +
                    ", img_title2='" + img_title2 + '\'' +
                    ", img_title3='" + img_title3 + '\'' +
                    ", img_title4='" + img_title4 + '\'' +
                    ", img_title5='" + img_title5 + '\'' +
                    ", img_title6='" + img_title6 + '\'' +
                    ", img_title7='" + img_title7 + '\'' +
                    ", img_title8='" + img_title8 + '\'' +
                    ", img_title9='" + img_title9 + '\'' +
                    ", img_title10='" + img_title10 + '\'' +
                    ", img_title11='" + img_title11 + '\'' +
                    ", img_title12='" + img_title12 + '\'' +
                    ", img_title_single='" + img_title_single + '\'' +
                    ", wind1='" + wind1 + '\'' +
                    ", wind2='" + wind2 + '\'' +
                    ", wind3='" + wind3 + '\'' +
                    ", wind4='" + wind4 + '\'' +
                    ", wind5='" + wind5 + '\'' +
                    ", wind6='" + wind6 + '\'' +
                    ", fx1='" + fx1 + '\'' +
                    ", fx2='" + fx2 + '\'' +
                    ", fl1='" + fl1 + '\'' +
                    ", fl2='" + fl2 + '\'' +
                    ", fl3='" + fl3 + '\'' +
                    ", fl4='" + fl4 + '\'' +
                    ", fl5='" + fl5 + '\'' +
                    ", fl6='" + fl6 + '\'' +
                    ", index='" + index + '\'' +
                    ", index_d='" + index_d + '\'' +
                    ", index48='" + index48 + '\'' +
                    ", index48_d='" + index48_d + '\'' +
                    ", index_uv='" + index_uv + '\'' +
                    ", index48_uv='" + index48_uv + '\'' +
                    ", index_xc='" + index_xc + '\'' +
                    ", index_tr='" + index_tr + '\'' +
                    ", index_co='" + index_co + '\'' +
                    ", st1='" + st1 + '\'' +
                    ", st2='" + st2 + '\'' +
                    ", st3='" + st3 + '\'' +
                    ", st4='" + st4 + '\'' +
                    ", st5='" + st5 + '\'' +
                    ", st6='" + st6 + '\'' +
                    ", index_cl='" + index_cl + '\'' +
                    ", index_ag='" + index_ag + '\'' +
                    '}';
        }

        public String city;
        public String city_en;
        public String date_y;
        public String date;
        public String week;
        public String fchh;
        public String cityid;
        public String temp1;
        public String temp2;
        public String temp3;
        public String temp4;
        public String temp5;
        public String temp6;
        public String weather1;
        public String weather2;
        public String weather3;
        public String weather4;
        public String weather5;
        public String weather6;
        public String img1;
        public String img2;
        public String img3;
        public String img4;
        public String img5;
        public String img6;
        public String img7;
        public String img8;
        public String img9;
        public String img10;
        public String img11;
        public String img12;
        public String img_single;
        public String img_title1;
        public String img_title2;
        public String img_title3;
        public String img_title4;
        public String img_title5;
        public String img_title6;
        public String img_title7;
        public String img_title8;
        public String img_title9;
        public String img_title10;
        public String img_title11;
        public String img_title12;
        public String img_title_single;
        public String wind1;
        public String wind2;
        public String wind3;
        public String wind4;
        public String wind5;
        public String wind6;
        public String fx1;
        public String fx2;
        public String fl1;
        public String fl2;
        public String fl3;
        public String fl4;
        public String fl5;
        public String fl6;
        public String index;
        public String index_d;
        public String index48;
        public String index48_d;
        public String index_uv;
        public String index48_uv;
        public String index_xc;
        public String index_tr;
        public String index_co;
        public String st1;
        public String st2;
        public String st3;
        public String st4;
        public String st5;
        public String st6;
        public String index_cl;
        public String index_ag;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weatherinfo=" + weatherinfo +
                '}';
    }
}
