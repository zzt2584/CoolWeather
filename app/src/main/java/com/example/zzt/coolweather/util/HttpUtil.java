package com.example.zzt.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 25845 on 2018/2/25.
 */

public class HttpUtil {

    //使用OkHttp和服务器进行交互
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client=new OkHttpClient();
        Request request=new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}
