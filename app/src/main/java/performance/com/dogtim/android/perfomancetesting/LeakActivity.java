package performance.com.dogtim.android.perfomancetesting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LeakActivity extends AppCompatActivity {
    private static LeakActivity leakActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leak);
        enableStaticMemberLeak();
    }

    private void enableStaticMemberLeak() {
        leakActivity = this;
    }
}
