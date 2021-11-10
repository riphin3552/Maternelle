package com.example.maternelle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Admin extends AppCompatActivity {
    private Button btnEcole;
    private Button BtnClasse;
    private Button BtnCreationCompte;
    private Button BtnActivite;
    private Button BtnSous_activite;
    private Button BtnficheCotes;
    private Button Btnpublier;
    private Button Btnapprenant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        btnEcole=(Button) findViewById(R.id.btnadmin_ecole);
        btnEcole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir=new Intent(getApplicationContext(),Ecole.class);
                startActivity(ouvrir);
            }
        });


        BtnClasse=(Button) findViewById(R.id.btnadmin_classe);
        BtnClasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Classes.class);
                startActivity(ouvrir2);
            }
        });

        BtnCreationCompte=(Button) findViewById(R.id.btnadmin_creationCpte);
        BtnCreationCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),CreationCompte.class);
                startActivity(ouvrir2);
            }
        });


        BtnActivite=(Button) findViewById(R.id.btnactivite);
        BtnActivite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Activites.class);
                startActivity(ouvrir2);
            }
        });

        BtnSous_activite=(Button) findViewById(R.id.btnadmin_sous_activite);
        BtnSous_activite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Sous_Activites.class);
                startActivity(ouvrir2);
            }
        });

        BtnficheCotes=(Button) findViewById(R.id.btnadminFiche_des_cotes);
        BtnficheCotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Fiche_de_cotes.class);
                startActivity(ouvrir2);
            }
        });


        Btnpublier=(Button) findViewById(R.id.btnadmin_exercice);
        Btnpublier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Publier_exercice.class);
                startActivity(ouvrir2);
            }
        });


        Btnapprenant=(Button) findViewById(R.id.btnadmin_Ajouteimages);
        Btnapprenant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Espace_apprenants.class);
                startActivity(ouvrir2);
            }
        });

    }
}