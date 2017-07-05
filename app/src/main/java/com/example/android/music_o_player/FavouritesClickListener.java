package com.example.android.music_o_player;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mr on 04-11-2016.
 */

public class FavouritesClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view)
    {
        Toast.makeText(view.getContext(),"list of favourites ",Toast.LENGTH_SHORT).show();
    }
}
