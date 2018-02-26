package com.example.zzt.coolweather.gson;

/**
 * Created by 25845 on 2018/2/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
