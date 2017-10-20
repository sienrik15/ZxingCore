package com.google.zxing.client.android.services;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LENOVO on 5/09/2017.
 */

public class BaseRetrofitClient {

    private static Retrofit retrofit = null;
    public static Retrofit getClient(String baseUrl){
        if (retrofit==null){
            OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                    .retryOnConnectionFailure(false)
                    .connectTimeout(20, TimeUnit.SECONDS)
                    .readTimeout(20, TimeUnit.SECONDS)
                    .writeTimeout(20, TimeUnit.SECONDS)
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
