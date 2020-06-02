package xyz.oreganoli.noise;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    TextView tuneView;
    String currentTune = "AACBD";
    NotePlayer player;
    ThreadPoolExecutor executor;
    private void updateTuneView() {
        tuneView.setText(currentTune);
    }
    public void clearTune(View view) {
        currentTune = "";
        updateTuneView();
    }
    public void playA(View view) {
        currentTune += "A";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
    }
    public void playB(View view) {
        currentTune += "B";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
    }
    public void playC(View view) {
        currentTune += "C";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
    }
    public void playD(View view) {
        currentTune += "D";
        updateTuneView();
        executor.execute(new MusicWorker(player, "D"));
    }
    public void playE(View view) {
        currentTune += "E";
        updateTuneView();
        executor.execute(new MusicWorker(player, "E"));
    }
    public void playF(View view) {
        currentTune += "F";
        updateTuneView();
        executor.execute(new MusicWorker(player, "F"));
    }
    public void playG(View view) {
        currentTune += "G";
        updateTuneView();
        executor.execute(new MusicWorker(player, "G"));
    }
    public void playTune(View view) {
        executor.execute(new MusicWorker(player, currentTune));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuneView = findViewById(R.id.tuneView);
        tuneView.setText(currentTune);
        player = new NotePlayer(this);
        executor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }
}
