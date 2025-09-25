import java.util.*;
import java.util.concurrent.*;

public class ConcurrencyExamples {
    public static void basicThread() throws InterruptedException {
        Thread t = new Thread(() -> System.out.println("Hello from " + Thread.currentThread().getName()));
        t.start(); t.join();
    }

    public static int parallelSum(List<Integer> nums) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        try {
            List<Callable<Integer>> tasks = new ArrayList<>();
            int chunk = Math.max(1, nums.size()/4);
            for (int i=0;i<nums.size();i+=chunk){
                final int start=i, end=Math.min(i+chunk, nums.size());
                tasks.add(() -> {
                    int s=0; for (int k=start;k<end;k++) s+=nums.get(k); return s;
                });
            }
            int sum=0;
            for (Future<Integer> f: pool.invokeAll(tasks)) sum += f.get();
            return sum;
        } finally { pool.shutdown(); }
    }

    public static void main(String[] args) throws Exception {
        basicThread();
        List<Integer> data = new ArrayList<>();
        for(int i=1;i<=1000;i++) data.add(i);
        System.out.println("Parallel sum = " + parallelSum(data));
    }
}
