package com.example.zzt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 25845 on 2018/2/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
