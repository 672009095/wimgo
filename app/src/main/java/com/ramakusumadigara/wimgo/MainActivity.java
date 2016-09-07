package com.ramakusumadigara.wimgo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.ramakusumadigara.wimgo.Http.search.SearchPresenter;
import com.ramakusumadigara.wimgo.Http.search.SearchView;
import com.ramakusumadigara.wimgo.service.Venues;
import com.ramakusumadigara.wimgo.utils.UtilsString;

import java.util.List;

public class MainActivity extends MvpActivity<SearchView,SearchPresenter> implements SearchView{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.getVenues("-7.7734636,110.346285",
                UtilsString.CLIENT_ID,
                UtilsString.CLIENT_SECRET,
                "20160804",
                "coffe");

    }

    @NonNull
    @Override
    public SearchPresenter createPresenter() {
        return new SearchPresenter();
    }

    @Override
    public void getVenues(List<Venues> venues) {
        Log.d("result",venues.get(0).getName().toString());
        Log.d("result","tes");
    }
}
