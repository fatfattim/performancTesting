package performance.com.dogtim.android.perfomancetesting;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public abstract class MainAppBase extends Application {

    private RefWatcher refWatcher;

    protected abstract RefWatcher installLeakCanary();

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        refWatcher = installLeakCanary();
    }

}
