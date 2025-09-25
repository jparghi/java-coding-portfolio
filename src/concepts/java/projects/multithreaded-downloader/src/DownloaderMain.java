import java.util.*;
import java.util.concurrent.*;

public class DownloaderMain {
    public static void main(String[] args) throws Exception {
        if (args.length==0){ System.out.println("Pass URLs as args"); return; }
        ExecutorService pool = Executors.newFixedThreadPool(Math.min(4, args.length));
        List<Future<String>> futures = new ArrayList<>();
        for (String url: args) futures.add(pool.submit(new Downloader(url)));
        for (Future<String> f: futures) System.out.println("Saved: " + f.get());
        pool.shutdown();
    }
}
