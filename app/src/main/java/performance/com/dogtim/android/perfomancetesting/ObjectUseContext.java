package performance.com.dogtim.android.perfomancetesting;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

public class ObjectUseContext {
    private Context context;

    private Handler handler;
    private Runnable runnable;

    public ObjectUseContext(final Context context) {
        this.context = context;
        this.handler = new Handler();
        this.runnable = new Runnable() {
            @Override
            public void run() {
                if (context == null) {
                    Log.d("dogtim", "context is null");
                }
                handler.postDelayed(this, 500);
            }
        };
    }

    public void start() {
        handler.post(runnable);
    }
}
