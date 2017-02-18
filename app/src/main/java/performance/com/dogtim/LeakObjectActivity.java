package performance.com.dogtim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LeakObjectActivity extends AppCompatActivity {
    private DeadPool deadPool;
    private boolean enableRelease = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak_some_object);
    }

    public void onCreateObject(View v) {
        deadPool = new DeadPool();
    }

    public void onReleaseObject(View v) {
        enableRelease = true;
    }

    public void onDetectObject(View v) {
        MainAppBase.getRefWatcher().watch(deadPool.getLeakInfo());
        if(enableRelease) {
            deadPool = null;
        }

    }
}
