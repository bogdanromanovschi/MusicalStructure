package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PurchaseMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_music);

        //Find the view that shows recently played items
        ImageView recent = (ImageView)findViewById(R.id.list_purchase_recent);
        //Set click listener on this view
        recent.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentScreen = new Intent(PurchaseMusic.this, RecentlyPlayed.class);
                startActivity(recentScreen);
            }
        });

        //Find the view that searches the library
        ImageView search = (ImageView)findViewById(R.id.list_purchase_search);
        //Set click listener on this view
        search.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchScreen = new Intent(PurchaseMusic.this, SearchLibrary.class);
                startActivity(searchScreen);
            }
        });

        //Find the view that lists the albums
        ImageView albums_p = (ImageView)findViewById(R.id.list_purchase_albums);
        //Set a click listener on this view
        albums_p.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent albumScreen = new Intent(PurchaseMusic.this, ListAlbums.class);
                startActivity(albumScreen);
            }
        });

        //Find the view that displays the track currently playing
        ImageView current = (ImageView)findViewById(R.id.list_purchase_now);
        //Set click listener on this view
        current.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent currentScreen = new Intent(PurchaseMusic.this, NowPlaying.class);
                startActivity(currentScreen);
            }
        });


    }
}
