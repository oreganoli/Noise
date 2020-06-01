package xyz.oreganoli.noise;

import android.media.SoundPool;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tuneView;
    String currentTune = "AACBD";
    NotePlayer notes;
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
        notes.playString("A");
    }
    public void playB(View view) {
        currentTune += "B";
        updateTuneView();
        notes.playString("B");
    }
    public void playC(View view) {
        currentTune += "C";
        updateTuneView();
        notes.playString("C");
    }
    public void playD(View view) {
        currentTune += "D";
        updateTuneView();
        notes.playString("D");
    }
    public void playE(View view) {
        currentTune += "E";
        updateTuneView();
        notes.playString("E");
    }
    public void playF(View view) {
        currentTune += "F";
        updateTuneView();
        notes.playString("F");
    }
    public void playG(View view) {
        currentTune += "G";
        updateTuneView();
        notes.playString("G");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuneView = findViewById(R.id.tuneView);
        tuneView.setText(currentTune);
        notes = new NotePlayer(this);
    }
}
