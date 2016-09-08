package com.ramakusumadigara.wimgo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.ramakusumadigara.wimgo.Http.search.SearchPresenter;
import com.ramakusumadigara.wimgo.Http.search.SearchView;
import com.ramakusumadigara.wimgo.service.Venues;
import com.ramakusumadigara.wimgo.utils.UtilsString;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends MvpActivity<SearchView,SearchPresenter> implements SearchView{
    @Bind(R.id.recycler_place)RecyclerView recyclerView;
    public List<Venues>venuesList;
    public VenueAdapter venueAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        venueAdapter = new VenueAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(venueAdapter);
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
        for (int i = 0; i <venues.size() ; i++) {
            Log.d("result",venues.get(i).getName().toString());
        }
        Log.d("result",venues.get(0).getName().toString());
        Log.d("result","tes");
        venueAdapter.append(venues);
        venueAdapter.notifyDataSetChanged();
    }
}
