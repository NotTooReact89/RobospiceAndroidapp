package com.putti.robospiceandroidapp;

import android.os.Bundle;
import com.putti.robospiceandroidapp.lists.EventsChildAdapter;
import com.putti.robospiceandroidapp.lists.EventsListFragment;
import com.octo.android.robospice.persistence.DurationInMillis;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

import android.app.FragmentManager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends BaseSpiceActivity {

    private SpiceRequest spiceRequest;
    TextView tvNoListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNoListItems=(TextView)findViewById(R.id.noListItems);
            FragmentManager fm = getFragmentManager();

            if (fm.findFragmentById(android.R.id.content) == null) {
                EventsListFragment list = new EventsListFragment();
                fm.beginTransaction().add(android.R.id.content, list).commit();
            }
            spiceRequest = new SpiceRequest();

            setProgressBarIndeterminate( false );
            setProgressBarVisibility( true );
            getSpiceManager().execute( spiceRequest, "json", DurationInMillis.ALWAYS_RETURNED, new SpiceRequestListener() );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public final class SpiceRequestListener implements RequestListener< Events > {

        @Override
        public void onRequestFailure( SpiceException spiceException ) {
            Toast.makeText( MainActivity.this, "failure", Toast.LENGTH_SHORT ).show();
        }

        @Override
        public void onRequestSuccess( final Events  result ) {

            if(result!=null) {
                if (result.getChildren().size() == 0){
                    tvNoListItems.setVisibility(View.VISIBLE);
                }
            else {
                if (result.getChildren() != null) {
                    tvNoListItems.setVisibility(View.GONE);
                    ListView listView = (ListView) findViewById(android.R.id.list);
                    EventsChildAdapter adapter = (EventsChildAdapter) listView.getAdapter();
                    adapter.clear();
                    adapter.addAll(result.getChildren());
                }
                }

            }
        }
    }
}
