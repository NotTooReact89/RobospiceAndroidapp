package com.putti.robospiceandroidapp;

import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.MenuItem;
import android.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetailsActivity extends AppCompatActivity{
	
	TextView tvTitle, tvDescription;
	ImageView imageUrl;
    private Toolbar mToolbar;

    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_details);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        getSupportActionBar().setTitle("Event Details");

        imageUrl = (ImageView) findViewById(R.id.imageViewURL);

		tvTitle = (TextView) findViewById(R.id.textViewTitle);
		tvDescription = (TextView) findViewById(R.id.textViewDescription);
		
		String description="", imageurl="", title="", updateddate="";
		
		Bundle bundle = getIntent().getExtras();
		if(bundle!=null){
		 description = bundle.getString("description");
		 imageurl = bundle.getString("imageurl");
		 title = bundle.getString("title");
		 updateddate = bundle.getString("updateddate");
		}
		
		System.out.println(description +","+ imageurl +","+ title +","+ updateddate);

		if(title != null) {
			SpannableString spanString = new SpannableString(title);
			spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
			spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
			tvTitle.setText(spanString);
		}

		if(description != null) {
			tvDescription.setText(Html.fromHtml(description));
		}
		
		Picasso.with(DetailsActivity.this).load(imageurl).into(imageUrl);
	}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
