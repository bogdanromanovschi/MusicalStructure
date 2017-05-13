package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RecentlyPlayed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);


        //Find the view that searches the library
        ImageView search = (ImageView)findViewById(R.id.list_recent_search);
        //Set click listener on this view
        search.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchScreen = new Intent(RecentlyPlayed.this, SearchLibrary.class);
                startActivity(searchScreen);
            }
        });

        //Find the view that lists the albums
        ImageView albums = (ImageView)findViewById(R.id.list_recent_albums);
        //Set a click listener on this view
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumScreen = new Intent(RecentlyPlayed.this, ListAlbums.class);
                startActivity(albumScreen);
            }
        });

        //Find the view that links to the store
        ImageView store = (ImageView)findViewById(R.id.list_recent_purchase);
        //Set click listener on this view
        store.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeScreen = new Intent(RecentlyPlayed.this, PurchaseMusic.class);
                startActivity(storeScreen);
            }
        });


        //Find the view that displays the track currently playing
        ImageView current = (ImageView)findViewById(R.id.list_recent_now);
        //Set click listener on this view
        current.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentScreen = new Intent(RecentlyPlayed.this, NowPlaying.class);
                startActivity(currentScreen);
            }
        });
    }
}
