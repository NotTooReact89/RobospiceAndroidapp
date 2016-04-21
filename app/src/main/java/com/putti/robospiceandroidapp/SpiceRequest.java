package com.putti.robospiceandroidapp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import roboguice.util.temp.Ln;
import android.util.Log;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.jackson.JacksonFactory;
import com.octo.android.robospice.request.googlehttpclient.GoogleHttpClientSpiceRequest;
import com.google.api.client.http.HttpResponse;

/**
 * Created by sharandhanala on 20/04/16.
 */
public class SpiceRequest extends GoogleHttpClientSpiceRequest<Events>{
    private String baseUrl="http://testing.moacreative.com/job_interview/event.php";

    public SpiceRequest() {
        super( Events.class );
        Ln.d("URL is: " + this.baseUrl);
    }

    @Override
    public Events loadDataFromNetwork() throws IOException {
        Ln.d( "Call web service " + baseUrl );

        Map<String, Object> params = new HashMap<String, Object>(3);
        params.put("event_type", "interview");
        HttpContent hc = new UrlEncodedContent(params);
        HttpRequest request = null;

        try {
            request = getHttpRequestFactory().buildPostRequest(new GenericUrl(baseUrl),hc);
            request.getHeaders().setUnknownKeys(params);
            request.getHeaders().set("X-Key","8dcb48d51f01bc7a84cb2f67ef363119");
            request.getHeaders().setUserAgent("MyTestClient : X-Signiture=1Uhi8g9A91");

            request.setParser( new JacksonFactory().createJsonObjectParser() );
            HttpResponse response = request.execute();
            String json = response.parseAsString();
            Log.d("Success request",json);

            if(json.contains("no match keys") == true){
                request=null;
                request = getHttpRequestFactory().buildPostRequest(new GenericUrl(baseUrl),hc);
                request.getHeaders().setUnknownKeys(params);
                request.getHeaders().set("X-Key","6459dafbdfddb6da54020844efd7eb9f");
                request.getHeaders().setUserAgent("MyTestClient : X-Signiture=1Uhi8g9A91");
                request.setParser( new JacksonFactory().createJsonObjectParser() );
            }
            //System.out.println(json.contains("no match keys"));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return request.execute().parseAs(getResultType());
    }
}
