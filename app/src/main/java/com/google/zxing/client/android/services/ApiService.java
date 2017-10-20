package com.google.zxing.client.android.services;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by LENOVO on 5/09/2017.
 */

public interface ApiService {

    @POST("verifyqr")
    @FormUrlEncoded
    Call<Modelchecking> savePost(@Field("id_activity") String id_activity,
                                 @Field("subTicketId") String subTicketId);

}
