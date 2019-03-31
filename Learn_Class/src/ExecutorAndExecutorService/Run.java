package ExecutorAndExecutorService;

public class Run implements Runnable {
    private int index;

    public Run(int index) {
      this.index=index;
    }


    @Override
    public void run() {
        System.out.println("--"+Thread.currentThread().getName()+"开始运行 任务"+index);
        try {
            int waitTime = 100 + index * 10;
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+" 发生中断异常  exception=="+e.getMessage());
        }
        System.out.println("======="+Thread.currentThread().getName()+"结束 任务"+index);
    }
}
