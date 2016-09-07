package com.ramakusumadigara.wimgo.Http;

import com.ramakusumadigara.wimgo.utils.UtilsString;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by skyshi on 07/09/16.
 */
public class Client {
    private static Retrofit retrofit;
    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                .baseUrl(UtilsString.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
            .build();

        }
        return retrofit;
    }
}
