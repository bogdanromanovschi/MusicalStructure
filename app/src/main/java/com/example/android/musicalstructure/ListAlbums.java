package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ListAlbums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_albums);

        //Find the view that shows recently played items
        ImageView recent = (ImageView)findViewById(R.id.list_albums_recent);
        //Set click listener on this view
        recent.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentScreen = new Intent(ListAlbums.this, RecentlyPlayed.class);
                startActivity(recentScreen);
            }
        });

        //Find the view that searches the library
        ImageView search = (ImageView)findViewById(R.id.list_albums_search);
        //Set click listener on this view
        search.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchScreen = new Intent(ListAlbums.this, SearchLibrary.class);
                startActivity(searchScreen);
            }
        });

        //Find the view that links to the store
        ImageView store = (ImageView)findViewById(R.id.list_albums_purchase);
        //Set click listener on this view
        store.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeScreen = new Intent(ListAlbums.this, PurchaseMusic.class);
                startActivity(storeScreen);
            }
        });

        //Find the view that displays the track currently playing
        ImageView current = (ImageView)findViewById(R.id.list_albums_now);
        //Set click listener on this view
        current.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentScreen = new Intent(ListAlbums.this, NowPlaying.class);
                startActivity(currentScreen);
            }
        });

    }
}
