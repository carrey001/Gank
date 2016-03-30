package com.carrey.gank.module.home;

import java.util.List;

/**
 * 类描述：
 * 创建人：carrey
 * 创建时间：2016/3/21 10:23
 */

public class HomeBean{

    public boolean error;
    public List<ResultsEntity> results;

    public static class ResultsEntity {
        public String _id;
        public String _ns;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public boolean used;
        public String who;

        @Override
        public String toString() {
            return "ResultsEntity{" +
                    "_id='" + _id + '\'' +
                    ", _ns='" + _ns + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", source='" + source + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", used=" + used +
                    ", who='" + who + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "HomeBean{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }
}
