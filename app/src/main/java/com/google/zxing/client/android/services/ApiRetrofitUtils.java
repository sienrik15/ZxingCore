package com.google.zxing.client.android.services;

/**
 * Created by LENOVO on 7/09/2017.
 */

public class ApiRetrofitUtils {

    public static String BASE_URL = "http://10.100.107.140:3000/api/";
    public ApiRetrofitUtils(){}


    public ApiRetrofitUtils(String BaseUrl){
        BASE_URL = BaseUrl;
    }

    public static ApiService getApiService(){
        return BaseRetrofitClient.getClient(BASE_URL).create(ApiService.class);
    }

}
