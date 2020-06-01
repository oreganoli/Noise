package xyz.oreganoli.noise;

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
        notes.a.start();
    }
    public void playB(View view) {
        currentTune += "B";
        updateTuneView();
        notes.b.start();
    }
    public void playC(View view) {
        currentTune += "C";
        updateTuneView();
        notes.c.start();
    }
    public void playD(View view) {
        currentTune += "C";
        updateTuneView();
        notes.d.start();
    }
    public void playE(View view) {
        currentTune += "D";
        updateTuneView();
        notes.e.start();
    }
    public void playF(View view) {
        currentTune += "F";
        updateTuneView();
        notes.f.start();
    }
    public void playG(View view) {
        currentTune += "G";
        updateTuneView();
        notes.g.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuneView = findViewById(R.id.tuneView);
        tuneView.setText(currentTune);
        notes = new NotePlayer();
        notes.populate(this);
    }
}
