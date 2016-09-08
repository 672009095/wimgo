package com.ramakusumadigara.wimgo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ramakusumadigara.wimgo.service.Venues;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skyshi on 08/09/16.
 */
public class VenueAdapter extends RecyclerView.Adapter<VenueAdapter.VenueViewHolder> {
    public List<Venues>venuesList= new ArrayList<Venues>();
    public Context context;
    public VenueAdapter(Context context){
        this.context = context;
    }
    @Override
    public VenueAdapter.VenueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View c = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_recycler_item,parent,false);
        return new VenueViewHolder(c);
    }

    @Override
    public void onBindViewHolder(VenueAdapter.VenueViewHolder holder, int position) {
        final Venues venues = venuesList.get(position);
        //if(venues.getName()!=null&& !venuesList.get(position).getName().isEmpty()) {
            holder.txt_title_view.setText(venues.getName().toString());
        //}
    }

    @Override
    public int getItemCount() {
        return venuesList.size();
    }

    public class VenueViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_title_view;
        public VenueViewHolder(View itemView) {
            super(itemView);
            txt_title_view = (TextView)itemView.findViewById(R.id.txt_tittle);
        }
    }
    public void append(List<Venues> venues){
        if(venuesList==null){
            setVenue(venues);
        }else{
            venuesList.addAll(venues);
        }
    }
    public void setVenue(List<Venues> venues){
        venuesList = venues;
    }
}
