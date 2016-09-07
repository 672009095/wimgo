package com.ramakusumadigara.wimgo.Http.search;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.ramakusumadigara.wimgo.service.Venues;

import java.util.List;

/**
 * Created by skyshi on 07/09/16.
 */
public interface SearchView extends MvpView{
    void getVenues(List<Venues> venues);
}
