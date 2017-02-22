package performance.com.dogtim;

import android.os.Handler;

public class AnonymousObject {

    private Handler handler;
    private Runnable runnable;

    public AnonymousObject() {
        this.handler = new Handler();
        this.runnable = new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(this, 500);
            }
        };
    }

    public void start() {
        handler.post(runnable);
    }
}
