package com.example.android.music_o_player;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mr on 29-10-2016.
 */

public class AllsongsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"list of all songs ",Toast.LENGTH_SHORT).show();
    }
}
