package performance.com.dogtim;

public class MainApp extends MainAppBase {
    @Override
    protected RefWatcher installLeakCanary() {
        return RefWatcher.DISABLED;
    }

}
