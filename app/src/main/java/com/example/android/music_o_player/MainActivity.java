package com.example.android.music_o_player;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AllsongsClickListener clickListener = new AllsongsClickListener();
        TextView allsongs = (TextView)findViewById(R.id.allsongs_view);
        allsongs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent allsong = new Intent(MainActivity.this,all_songs.class);
                startActivity(allsong);
            }

        });

        FavouritesClickListener clickListener1 = new FavouritesClickListener();
        TextView favr = (TextView)findViewById(R.id.fav_view);
        favr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent favour = new Intent(MainActivity.this,favourites.class);
                startActivity(favour);
            }
        });
        ArtistsClickListener clickListener2 = new ArtistsClickListener();
        TextView artist = (TextView)findViewById(R.id.artist_view);
        artist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent art = new Intent(MainActivity.this,artists.class);
                startActivity(art);
            }
        });
        CategoriesClickListener clickListener3 = new CategoriesClickListener();
        TextView categories = (TextView)findViewById(R.id.categories_view);
        categories.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent cat = new Intent(MainActivity.this,categories.class);
                startActivity(cat);
            }
        });
        TextView you = (TextView) findViewById(R.id.online_view);
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://youtube.com/";
                Uri webpage = Uri.parse(url);
                Intent yout = new Intent(Intent.ACTION_VIEW, webpage);
                if (yout.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(yout);
                }
            }
        });
        NowplayingClickListener clickListener4 = new NowplayingClickListener();
        TextView now = (TextView)findViewById(R.id.playing );
        now.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent play = new Intent(MainActivity.this,now_playing.class);
                startActivity(play);
            }
        });
    }
}
