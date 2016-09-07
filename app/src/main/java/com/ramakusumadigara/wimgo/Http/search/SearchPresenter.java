package com.ramakusumadigara.wimgo.Http.search;

import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.ramakusumadigara.wimgo.Http.APIInterface;
import com.ramakusumadigara.wimgo.Http.Client;
import com.ramakusumadigara.wimgo.service.ResponseService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * Created by skyshi on 07/09/16.
 */
public class SearchPresenter extends MvpBasePresenter<SearchView>{
    public SearchPresenter(){

    }
    public void getVenues(String ll,String client_id,String client_secret,String v,String query){
        Log.d("param",ll+client_id+client_secret+v+query);
        APIInterface api = Client.getClient().create(APIInterface.class);
        Call<ResponseService> call = api.getSearch(ll,client_id,client_secret,v,query);
        call.enqueue(new Callback<ResponseService>() {
            @Override
            public void onResponse(Call<ResponseService> call, Response<ResponseService> response) {
                Log.d("response","responseSuccess");
                //if (response.isSuccessful()) {
                    getView().getVenues(response.body().getResponse().getVenues());
                //}
            }

            @Override
            public void onFailure(Call<ResponseService> call, Throwable t) {
                Log.d("response","responseFail"+t.toString());

            }
        });
    }
}
