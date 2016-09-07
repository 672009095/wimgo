package com.ramakusumadigara.wimgo.Http;

import com.ramakusumadigara.wimgo.service.ResponseService;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by skyshi on 07/09/16.
 */
public interface APIInterface {
    //SEARCH
    @FormUrlEncoded
    @POST("v2/venues/search")
    Call<ResponseService>getSearch(
            @Field("ll") String ll,
            @Field("client_id") String client_id,
            @Field("client_secret") String client_secret,
            @Field("v") String v,
            @Field("query")String query
    );
}
