package com.example.android.music_o_player;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mr on 06-11-2016.
 */

public class NowplayingClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"now playing song ",Toast.LENGTH_SHORT).show();
    }
}
