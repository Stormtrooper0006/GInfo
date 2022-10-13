package com.dicoding.picodiploma.ginfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGames;
    private ArrayList<Bridge> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGames = findViewById(R.id.rv_game);
        rvGames.setHasFixedSize(true);

        list.addAll(GamesData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView() {
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        CardViewGameAdapter cardViewGameAdapter = new CardViewGameAdapter(list);
        rvGames.setAdapter(cardViewGameAdapter);
    }

    private void showRecyclerListView() {
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        ListGameAdapter listGameAdapter = new ListGameAdapter(list);
        rvGames.setAdapter(listGameAdapter);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerListView();
                break;

            case R.id.action_cardView:
                showRecyclerCardView();
                break;

            case R.id.action_about:
                Intent moveIntent = new Intent(MainActivity.this, AboutDeveloper.class);
                startActivity(moveIntent);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
}
