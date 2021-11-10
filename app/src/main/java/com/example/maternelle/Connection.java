package com.example.maternelle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Connection extends AppCompatActivity{

    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

      Login=(Button) findViewById(R.id.btnSeloguer);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir=new Intent(getApplicationContext(),Tableau_de_bord.class);
                startActivity(ouvrir);
            }
        });

        }

    }
