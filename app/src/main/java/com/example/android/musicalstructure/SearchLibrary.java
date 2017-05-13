package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_library);

        //Find the view that shows recently played items
        ImageView recent = (ImageView)findViewById(R.id.list_search_recent);
        //Set click listener on this view
        recent.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentScreen = new Intent(SearchLibrary.this, RecentlyPlayed.class);
                startActivity(recentScreen);
            }
        });

        //Find the view that lists the albums
        ImageView albums = (ImageView)findViewById(R.id.list_search_albums);
        //Set a click listener on this view
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumScreen = new Intent(SearchLibrary.this, ListAlbums.class);
                startActivity(albumScreen);
            }
        });

        //Find the view that links to the store
        ImageView store = (ImageView)findViewById(R.id.list_search_purchase);
        //Set click listener on this view
        store.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeScreen = new Intent(SearchLibrary.this, PurchaseMusic.class);
                startActivity(storeScreen);
            }
        });

        //Find the view that displays the track currently playing
        ImageView current = (ImageView)findViewById(R.id.list_search_now);
        //Set click listener on this view
        current.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentScreen = new Intent(SearchLibrary.this, NowPlaying.class);
                startActivity(currentScreen);
            }
        });


    }
}
