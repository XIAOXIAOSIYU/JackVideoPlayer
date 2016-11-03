package com.jackzc.jackvideoplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final VideoView buckysVideoView = (VideoView) findViewById(R.id.buckysVideoView);
        int video_resource_id = getResources().getIdentifier("video","raw",getPackageName());
        String path = "android.resource://" + getPackageName() + "/" + video_resource_id;
        buckysVideoView.setVideoURI(Uri.parse(path));

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(buckysVideoView);
        buckysVideoView.setMediaController(mediaController);

        buckysVideoView.start();
    }


}
