package performance.com.dogtim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LeakActivity extends AppCompatActivity {
    private static LeakActivity leakActivity;
    private AnonymousObject anonymousObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        //enableStaticMemberLeak();
        enableObjectBindActivity();
    }

    private void enableStaticMemberLeak() {
        leakActivity = this;
    }

    private void enableObjectBindActivity() {
        anonymousObject = new AnonymousObject();
        anonymousObject.start();
    }

}
