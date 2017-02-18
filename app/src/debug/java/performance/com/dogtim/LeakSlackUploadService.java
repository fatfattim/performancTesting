package performance.com.dogtim;

import com.squareup.leakcanary.AnalysisResult;
import com.squareup.leakcanary.DisplayLeakService;
import com.squareup.leakcanary.HeapDump;

public final class LeakSlackUploadService extends DisplayLeakService {

    @Override
    protected void afterDefaultHandling(HeapDump heapDump, AnalysisResult result, String leakInfo) {
        if (!result.leakFound || result.excludedLeak) {
            return;
        }

        LeakSender leakSender = new LeakSender();
        String title = " (ㄒoㄒ) (ㄒoㄒ) (ㄒoㄒ) (ㄒoㄒ)  (ㄒoㄒ) (ㄒoㄒ) (ㄒoㄒ) (ㄒoㄒ)\n ";
        String initialComment = title + leakInfo ;
        leakSender.send(initialComment);
    }
}