package xyz.oreganoli.noise;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    ButtonCollection buttons;
    Button saveButton;
    TextView tuneView;
    String currentTune = "";
    NotePlayer player;
    ThreadPoolExecutor executor;
    private void updateTuneView() {
        tuneView.setText(currentTune);
        if (currentTune.isEmpty()) {
            saveButton.setEnabled(false);
        } else {
            saveButton.setEnabled(true);
        }
    }
    public void clearTune(View view) {
        currentTune = "";
        updateTuneView();
    }
    public void playA(View view) {
        currentTune += "A";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
        buttons.colorize(R.id.playA);
    }
    public void playB(View view) {
        currentTune += "B";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
        buttons.colorize(R.id.playB);
    }
    public void playC(View view) {
        currentTune += "C";
        updateTuneView();
        executor.execute(new MusicWorker(player, "A"));
        buttons.colorize(R.id.playC);
    }
    public void playD(View view) {
        currentTune += "D";
        updateTuneView();
        executor.execute(new MusicWorker(player, "D"));
        buttons.colorize(R.id.playD);
    }
    public void playE(View view) {
        currentTune += "E";
        updateTuneView();
        executor.execute(new MusicWorker(player, "E"));
        buttons.colorize(R.id.playE);
    }
    public void playF(View view) {
        currentTune += "F";
        updateTuneView();
        executor.execute(new MusicWorker(player, "F"));
        buttons.colorize(R.id.playF);
    }
    public void playG(View view) {
        currentTune += "G";
        updateTuneView();
        executor.execute(new MusicWorker(player, "G"));
        buttons.colorize(R.id.playG);
    }
    public void playTune(View view) {
        executor.execute(new MusicWorker(player, currentTune));
    }
    public void saveTune(View view) throws IOException {
        String filename = "song-" + System.currentTimeMillis() / 1000L + ".music";
        File path = getExternalFilesDir(null);
        File file = new File(path, filename);
        RandomAccessFile raf = new RandomAccessFile(file, "rws");
        raf.writeUTF(currentTune);
        raf.close();
        Toast.makeText(this, "Saved as " + path.getAbsolutePath() + "/" + filename, Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new ButtonCollection(this);
        tuneView = findViewById(R.id.tuneView);
        saveButton = findViewById(R.id.saveButton);
        tuneView.setText(currentTune);
        updateTuneView();
        player = new NotePlayer(this);
        executor = new ThreadPoolExecutor(4, 4, 10, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
    }
}
