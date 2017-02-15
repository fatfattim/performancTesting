package performance.com.dogtim.android.perfomancetesting;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class MainApp extends MainAppBase {
    @Override
    protected RefWatcher installLeakCanary() {
        return RefWatcher.DISABLED;
    }

}
