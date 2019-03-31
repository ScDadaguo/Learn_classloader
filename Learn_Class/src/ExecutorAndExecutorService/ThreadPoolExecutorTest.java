package ExecutorAndExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {
        ThreadFactory threadFactory=new MyThreadFactory();
        // 固定数量的线程池
        ExecutorService service= Executors.newFixedThreadPool(3,threadFactory);
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i <6 ; i++) {
            Future<Integer> future = service.submit(new Run(i), i);
            list.add(future);
        }

        for(Future<Integer> future: list) {
            try {
                System.out.println("=================主线程获取任务结果值  "+future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("主线程运行结束");
    }
}
