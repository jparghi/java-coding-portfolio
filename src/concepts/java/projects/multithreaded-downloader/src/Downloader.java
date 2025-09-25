import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.concurrent.Callable;

class Downloader implements Callable<String> {
    private final String url;
    Downloader(String url){ this.url = url; }
    public String call() throws Exception {
        String fileName = url.replaceAll("[^a-zA-Z0-9._-]", "_");
        Path dir = Paths.get("downloads");
        Files.createDirectories(dir);
        Path out = dir.resolve(fileName);
        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, out, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
        }
        return out.toString();
    }
}
