package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find the view that shows recently played items
        TextView recent = (TextView)findViewById(R.id.replay_click_area);
        //Set click listener on this view
        recent.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentScreen = new Intent(MainActivity.this, RecentlyPlayed.class);
                startActivity(recentScreen);
            }
        });

        //Find the view that searches the library
        TextView search = (TextView)findViewById(R.id.search_click_area);
        //Set a click listener on this view
        search.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent searchScreen = new Intent(MainActivity.this, SearchLibrary.class);
                startActivity(searchScreen);
            }
        });

        //Find the view that lists the albums
        TextView albums = (TextView)findViewById(R.id.album_click_area);
        //Set a click listener on this view
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumScreen = new Intent(MainActivity.this, ListAlbums.class);
                startActivity(albumScreen);
            }
        });

        //Find the view that links to the store
        TextView store = (TextView)findViewById(R.id.store_click_area);
        //Set a click listener on this view
        store.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent storeScreen = new Intent(MainActivity.this, PurchaseMusic.class);
                startActivity(storeScreen);
            }
        });

        //Find the view that displays the track currently playing
        TextView current = (TextView)findViewById(R.id.now_playing_click_area);
        //Set a click listener on this view
        current.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent nowScreen = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowScreen);
            }
        });

    }


}
