package com.example.maternelle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;

public class Activites extends AppCompatActivity {

    private Button listeactivites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activites);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.activites, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.txtactivites:
           listeactivites=(Button) findViewById(R.id.txtactivites);
                Intent ouvrir = new Intent(getApplicationContext(), liste_activites.class);
                startActivity(ouvrir);
        }
        return super.onOptionsItemSelected(item);
    }
}