package xyz.oreganoli.noise;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView tuneView;
    String currentTune = "AACBD";

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
    }
    public void playB(View view) {
        currentTune += "B";
        updateTuneView();
    }
    public void playC(View view) {
        currentTune += "C";
        updateTuneView();
    }
    public void playD(View view) {
        currentTune += "C";
        updateTuneView();
    }
    public void playE(View view) {
        currentTune += "D";
        updateTuneView();
    }
    public void playF(View view) {
        currentTune += "F";
        updateTuneView();
    }
    public void playG(View view) {
        currentTune += "G";
        updateTuneView();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuneView = findViewById(R.id.tuneView);
        tuneView.setText(currentTune);
    }
}
