package designpatterns;

/**
 * Adapter Pattern Example: Useful for integrating incompatible interfaces (e.g., legacy system integration).
 */
interface MediaPlayer {
    void play(String fileName);
}

class AudioPlayer implements MediaPlayer {
    public void play(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}

class VLCPlayer {
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

class MediaAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;
    public MediaAdapter() { vlcPlayer = new VLCPlayer(); }
    public void play(String fileName) {
        vlcPlayer.playVLC(fileName);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("example.vlc");
    }
}
