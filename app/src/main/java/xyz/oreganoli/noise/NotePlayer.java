package xyz.oreganoli.noise;

import android.content.Context;
import android.media.MediaPlayer;

public class NotePlayer {
    MediaPlayer a;
    MediaPlayer b;
    MediaPlayer c;
    MediaPlayer d;
    MediaPlayer e;
    MediaPlayer f;
    MediaPlayer g;
    public void populate(Context ctx) {
        a = MediaPlayer.create(ctx, R.raw.a);
        b = MediaPlayer.create(ctx, R.raw.b);
        c = MediaPlayer.create(ctx, R.raw.c);
        d = MediaPlayer.create(ctx, R.raw.d);
        e = MediaPlayer.create(ctx, R.raw.e);
        f = MediaPlayer.create(ctx, R.raw.f);
        g = MediaPlayer.create(ctx, R.raw.g);
    }
}
