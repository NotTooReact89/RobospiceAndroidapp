package com.putti.robospiceandroidapp.lists;

import java.util.ArrayList;

import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.putti.robospiceandroidapp.DetailsActivity;
import com.putti.robospiceandroidapp.Event;

public class EventsListFragment extends ListFragment{

    ArrayList<Event> eventsChildren;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Bundle bundle=new Bundle();
        bundle.putString("description", eventsChildren.get(position).getDescription());
        bundle.putString("imageurl", eventsChildren.get(position).getOriginalImageURL());
        bundle.putString("title", eventsChildren.get(position).getTitle());
        bundle.putString("updateddate", eventsChildren.get(position).getUpdatedDate());
        Intent intent=new Intent(getActivity(),DetailsActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		eventsChildren = new ArrayList<Event>();
		EventsChildAdapter adapter = new EventsChildAdapter(inflater.getContext(), eventsChildren);
		setListAdapter(adapter);
		return super.onCreateView(inflater, container, savedInstanceState);
	}

    /*@Override
    public void onStart(){
        super.onStart();

        getListView().setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(),"Data: "+eventsChildren.get(i),Toast.LENGTH_LONG);
            }
        });
    }*/
}
