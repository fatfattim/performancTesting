package performance.com.dogtim.android.perfomancetesting;


import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class LeakSender {
    OkHttpClient client;
    private String slackUrl = "https://hooks.slack.com/services/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";
    public LeakSender() {
        client = new OkHttpClient();
    }

    public void send(String message) {
        String content = "{ \"username\":\"deadpool\", " +
                "\"text\":\"" + message + "\", " +
                "\"channel\":\"#leak_demo\" }";

        RequestBody formBody = new FormBody.Builder()
                .add("payload", content)
                .build();
        Request request = new Request.Builder()
                .url(slackUrl)
                .post(formBody)
                .build();

        try {
            client.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
