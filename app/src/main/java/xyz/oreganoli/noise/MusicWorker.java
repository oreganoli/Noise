package xyz.oreganoli.noise;

public class MusicWorker implements Runnable {
    NotePlayer player;
    String song;

    public MusicWorker(NotePlayer player, String song) {
        this.player = player;
        this.song = song;
    }
    public void run() {
        player.playString(song);
    }
}
