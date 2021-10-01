package com.example.cityguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] attraction ={ "Art Institute of Chicago", "Magnificent Mile", "Willis Tower", "Navy Pier", "Water Tower"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        ListView listView = findViewById(R.id.myListView);
        ArrayAdapter<String> adapter  =
                new ArrayAdapter<>(this, R.layout.activity_main, R.id.travel, attraction);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));

                        break;
                    case 1:
                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));

                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, Willis.class));

                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, Pier.class));

                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, Water.class));

                        break;
                }
            }
        });
    }

}