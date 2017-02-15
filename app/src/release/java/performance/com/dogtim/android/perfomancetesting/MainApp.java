package performance.com.dogtim.android.perfomancetesting;

public class MainApp extends MainAppBase {
    @Override
    protected RefWatcher installLeakCanary() {
        return RefWatcher.DISABLED;
    }

}
