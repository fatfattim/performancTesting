package performance.com.dogtim;

public class DeadPool {

    private String leakInfo;

    public DeadPool() {
        leakInfo = String.valueOf("Meow");
    }

    public void releaseInternalObject() {
        leakInfo = null;
    }

    public Object getLeakInfo() {
        return leakInfo;
    }
}
