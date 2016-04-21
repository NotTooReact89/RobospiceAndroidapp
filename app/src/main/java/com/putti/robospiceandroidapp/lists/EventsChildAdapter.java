package com.putti.robospiceandroidapp.lists;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.putti.robospiceandroidapp.Event;
import com.putti.robospiceandroidapp.R;
import com.squareup.picasso.Picasso;

public class EventsChildAdapter extends ArrayAdapter<Event> {

    Context context;
    RelativeLayout root;
    private static class ViewHolder {
        TextView title;
		ImageView thumbnail;
    }
	
	public EventsChildAdapter(Context context, ArrayList<Event> eventsChildren) {
		super(context, R.layout.item_listing, eventsChildren);
        this.context = context;
    }

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// Get the data item for this position
		Event child = getItem(position);
		// Check if an existing view is being reused, otherwise inflate the view
	       ViewHolder viewHolder;
	       if (convertView == null) {
	          viewHolder = new ViewHolder();
	          LayoutInflater inflater = LayoutInflater.from(getContext());
	          convertView = inflater.inflate(R.layout.item_listing, null);

               viewHolder.title = (TextView) convertView.findViewById(R.id.tvTitle);
			   viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.ivIcon);

	          convertView.setTag(viewHolder);
	       } else {
	           viewHolder = (ViewHolder) convertView.getTag();
	       }
	       // Populate the data into the template view using the data object

	       viewHolder.title.setText(child.getTitle());
            Picasso.with(this.context).load(child.getThumbnailImageURL()).placeholder(context.getResources().getDrawable(R.drawable.ic_launcher)).error(context.getResources().getDrawable(R.drawable.ic_launcher)).resize(200, 100).into(viewHolder.thumbnail);

        // Return the completed view to render on screen
	       return convertView;
	}
}
