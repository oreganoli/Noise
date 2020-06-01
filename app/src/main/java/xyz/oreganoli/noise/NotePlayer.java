package xyz.oreganoli.noise;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import androidx.annotation.NonNull;

public class NotePlayer {
    SoundPool pool;
    private Integer idFromNote(char note) {
        switch (note) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            default:
                return null;
        }
    }
    public NotePlayer(Context ctx) {
        pool = new SoundPool.Builder()
            .setMaxStreams(1)
            .setAudioAttributes(new AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build())
            .build();
        pool.load(ctx, R.raw.a, 1);
        pool.load(ctx, R.raw.b, 1);
        pool.load(ctx, R.raw.c, 1);
        pool.load(ctx, R.raw.d, 1);
        pool.load(ctx, R.raw.e, 1);
        pool.load(ctx, R.raw.f, 1);
        pool.load(ctx, R.raw.g, 1);
        pool.setOnLoadCompleteListener(new OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                System.out.println("loaded " + Integer.toString(sampleId));
            }
        });
    }
    public void playString(String tune) {
        Integer soundId;
        String input = tune.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            soundId = idFromNote(input.charAt(i));
            if (soundId != null) {
               pool.play(soundId, 1, 1, 1, 0, 1);
            }
        }
    }
}
