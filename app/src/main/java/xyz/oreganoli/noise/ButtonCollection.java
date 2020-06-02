package xyz.oreganoli.noise;

import android.graphics.Color;
import android.widget.Button;

import java.util.ArrayList;

public class ButtonCollection {
    ArrayList<Button> buttons;
    public ButtonCollection(MainActivity view) {
        buttons = new ArrayList<>();
        buttons.add(view.<Button>findViewById(R.id.playA));
        buttons.add(view.<Button>findViewById(R.id.playB));
        buttons.add(view.<Button>findViewById(R.id.playC));
        buttons.add(view.<Button>findViewById(R.id.playD));
        buttons.add(view.<Button>findViewById(R.id.playE));
        buttons.add(view.<Button>findViewById(R.id.playF));
        buttons.add(view.<Button>findViewById(R.id.playG));
    }
    public void colorize(int id) {
        for (Button each : buttons) {
            if (each.getId() == id) {
                each.setBackgroundColor(Color.rgb(0, 200, 0));
            } else {
                each.setBackgroundColor(Color.rgb(200, 0, 0));
            }
        }
    }
}
