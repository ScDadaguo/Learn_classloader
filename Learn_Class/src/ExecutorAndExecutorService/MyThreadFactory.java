package ExecutorAndExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
    private int sequenceNumber = 0;
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r, "线程"+(++sequenceNumber));

    }
}
