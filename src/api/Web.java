package api;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Web
{
    HttpClient client = new DefaultHttpClient();
    HttpGet request = new HttpGet("http://www.vogella.com");
    try
    {
        HttpResponse response = client.execute(request);
    }
    

    // Get the response
    BufferedReader rd = new BufferedReader
            (new InputStreamReader(
                    response.getEntity().getContent()));

    String line = "";
    while ((line = rd.readLine()) != null)
    {
    textView.append(line);
    }
}
