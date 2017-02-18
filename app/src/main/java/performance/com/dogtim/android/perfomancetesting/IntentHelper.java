package performance.com.dogtim.android.perfomancetesting;

import android.content.Context;
import android.content.Intent;

public class IntentHelper {

    public static void goToLeakActivity(final Context context) {
        Intent intent = new Intent(context, LeakActivity.class);
        context.startActivity(intent);
    }

    public static void goToLeakObject(final Context context) {
        Intent intent = new Intent(context, LeakObjectActivity.class);
        context.startActivity(intent);
    }
}
