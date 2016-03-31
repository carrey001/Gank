package com.carrey.gank.network;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/3/31 16:17
 */

public enum Category {

    YELLOPNG("福利"), ANDROID("Android"), IOS("iOS"), all("all"),
    JSHTML("前端");

    //    福利|Android|iOS|休息视频|拓展资源|前端|all

    String category;

    Category(String cat) {
        category = cat;
    }
}
