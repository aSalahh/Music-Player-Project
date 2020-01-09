package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AdeleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> Songs = new ArrayList<Song>();

        Songs.add(new Song("Hello", "Adele"));
        Songs.add(new Song("One and Only LYRICS!", "Adele"));
        Songs.add(new Song("Lovesong", "Adele"));
        Songs.add(new Song("I Found A Boy", "Adele?"));
        Songs.add(new Song("He Won't Go", "Adele"));
        Songs.add(new Song("I Miss You", "Adele"));
        Songs.add(new Song("Rumor has it", "Adele"));
        Songs.add(new Song("My Same", "Adele"));
        Songs.add(new Song("Send My Love", "Adele"));
        Songs.add(new Song("Rolling In The Deep", "Adele"));

        ArrayAdapter<Song> itemsAdapter = new ArrayAdapter<Song>(this,R.layout.list_item,Songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
