package com.example.maternelle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

public class Sous_Activites extends AppCompatActivity {

    private Button listesousActivites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sous__activites);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.sous_activites, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.txtsousactivites:
                listesousActivites=(Button) findViewById(R.id.txtsousactivites);
                Intent ouvrir = new Intent(getApplicationContext(), liste_sous_activites.class);
                startActivity(ouvrir);

        }

        return super.onOptionsItemSelected(item);
    }
}