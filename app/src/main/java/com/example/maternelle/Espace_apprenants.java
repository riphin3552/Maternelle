package com.example.maternelle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Espace_apprenants extends AppCompatActivity {
private Button Resoudre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espace_apprenants);

    }
        @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.apprenants, menu);
        return true;
    }

        @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.txtdevoir:
                Resoudre = (Button) findViewById(R.id.txtdevoir);

                Intent ouvrir2 = new Intent(getApplicationContext(), Devoirs.class);
                startActivity(ouvrir2);
                Toast.makeText(this,"fenetre ouverte avec succes",Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}