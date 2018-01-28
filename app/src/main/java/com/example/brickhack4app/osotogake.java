package com.example.brickhack4app;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by JMenezes on 1/27/2018.
 */

public class osotogake extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.techniquedescription);
        TextView textElement = (TextView) findViewById(R.id.techniqueName);
        textElement.setText("O soto gake");
        TextView textElement2 = (TextView) findViewById(R.id.techniqueDescription);
        textElement2.setText("Major or large outer reap");
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);
    }
    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("OM11NEW1f3g");
        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }
}
