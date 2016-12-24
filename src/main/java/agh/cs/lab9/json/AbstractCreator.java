package agh.cs.lab9.json;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public abstract class AbstractCreator {

    private static OkHttpClient client = new OkHttpClient();

    protected String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    protected abstract String getUrl();
}
