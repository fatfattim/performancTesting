package performance.com.dogtim;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class MainApp extends MainAppBase {

    @Override
    protected RefWatcher installLeakCanary() {
        return LeakCanary.refWatcher(this)
                .listenerServiceClass(LeakSlackUploadService.class)
                .buildAndInstall();
    }

}
