package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //Find the view that shows recently played items
        ImageView recent = (ImageView)findViewById(R.id.list_now_recent);
        //Set click listener on this view
        recent.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentScreen = new Intent(NowPlaying.this, RecentlyPlayed.class);
                startActivity(recentScreen);
            }
        });

        //Find the view that searches the library
        ImageView search = (ImageView)findViewById(R.id.list_now_search);
        //Set click listener on this view
        search.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchScreen = new Intent(NowPlaying.this, SearchLibrary.class);
                startActivity(searchScreen);
            }
        });

        //Find the view that lists the albums
        ImageView albums = (ImageView)findViewById(R.id.list_now_albums);
        //Set a click listener on this view
        albums.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumScreen = new Intent(NowPlaying.this, ListAlbums.class);
                startActivity(albumScreen);
            }
        });

        //Find the view that links to the store
        ImageView store = (ImageView)findViewById(R.id.list_now_purchase);
        //Set click listener on this view
        store.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent storeScreen = new Intent(NowPlaying.this, PurchaseMusic.class);
                startActivity(storeScreen);
            }
        });




    }
}
