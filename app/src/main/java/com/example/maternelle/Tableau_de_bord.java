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
import android.widget.ImageButton;
import android.widget.Toast;

public class Tableau_de_bord extends AppCompatActivity {
    private ImageButton btnECOLE;
    private ImageButton BtnClasse;
    private ImageButton BtnCreationCompte;
    private ImageButton BtnActivite;
    private ImageButton BtnSous_activite;
    private ImageButton BtnficheCotes;
    private ImageButton Btnpublier;
    private ImageButton Btnapprenant;
    private Button Ajouter;
    private  Button Cotes;
    private  Button videos;
    private  Button galerievideos;
    private  Button galerieimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableau_de_bord);


        btnECOLE=(ImageButton) findViewById(R.id.btnecole);
        btnECOLE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir=new Intent(getApplicationContext(),Ecole.class);
                startActivity(ouvrir);
            }
        });

        BtnClasse=(ImageButton) findViewById(R.id.btnlaclasse);
        BtnClasse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Classes.class);
                startActivity(ouvrir2);
            }
        });

        BtnCreationCompte=(ImageButton) findViewById(R.id.btnleCompte);
        BtnCreationCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),CreationCompte.class);
                startActivity(ouvrir2);
            }
        });


        BtnActivite=(ImageButton) findViewById(R.id.btnactivite);
        BtnActivite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Activites.class);
                startActivity(ouvrir2);
            }
        });

        BtnSous_activite=(ImageButton) findViewById(R.id.btnsous_activite);
        BtnSous_activite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Sous_Activites.class);
                startActivity(ouvrir2);
            }
        });




        Btnpublier=(ImageButton) findViewById(R.id.btnpublierExercice);
        Btnpublier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ouvrir2=new Intent(getApplicationContext(),Publier_exercice.class);
                startActivity(ouvrir2);
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.administrateur, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.txtimages:
                Ajouter = (Button) findViewById(R.id.txtimages);

                Intent ouvrir2 = new Intent(getApplicationContext(), Images.class);
                startActivity(ouvrir2);
                Toast.makeText(this,"fenetre ouverte avec succes",Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtfiche_cotes:
                Cotes=(Button) findViewById(R.id.txtfiche_cotes);
                Intent ouvrir1 = new Intent(getApplicationContext(), Fiche_de_cotes.class);
                startActivity(ouvrir1);
                Toast.makeText(this,"Voici la fiche des cotes",Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtvideo:
                videos=(Button) findViewById(R.id.txtvideo);
                Intent ouvrir3 = new Intent(getApplicationContext(), Videos.class);
                startActivity(ouvrir3);
                Toast.makeText(this,"Ajoute une videos ici",Toast.LENGTH_SHORT).show();
                break;

            case R.id.txtgalerie_videos:
                galerievideos=(Button) findViewById(R.id.txtgalerie_videos);
                Intent ouvrir4 = new Intent(getApplicationContext(), Galerie_videos.class);
                startActivity(ouvrir4);
                //Toast.makeText(this,"Ajoute une videos ici",Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtgalerie_images:
                galerieimage=(Button) findViewById(R.id.txtgalerie_images);
                Intent ouvrir5 = new Intent(getApplicationContext(), Galerie_images.class);
                startActivity(ouvrir5);
                //Toast.makeText(this,"Ajoute une videos ici",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

}