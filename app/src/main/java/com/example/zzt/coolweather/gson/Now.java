package com.example.zzt.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 25845 on 2018/2/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
