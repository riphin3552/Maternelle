package com.example.maternelle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import javax.net.ssl.HttpsURLConnection;
public class Images extends AppCompatActivity {

    private EditText idimage;
    private EditText imageEn_text,nomPhoto;;
    private Button SelectionnerPhoto,envoyerPhoto;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        SelectionnerPhoto = (Button)findViewById(R.id.btnparcourir);
        envoyerPhoto = (Button)findViewById(R.id.btnajoutimage);
        idimage=(EditText) findViewById(R.id.txtidimage);
        imageEn_text=(EditText) findViewById(R.id.txtphoto);
        nomPhoto=(EditText) findViewById(R.id.txtdesignationImage);



    }

}