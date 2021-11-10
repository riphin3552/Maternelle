package com.example.maternelle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button BoutonAuthentifier;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* Objects.requireNonNull(this.getSupportActionBar()).hide();
        Thread tread=new Thread(){
            @Override
            public void run() {
                super.run();

                try {
                    sleep(4000);

                    Intent intent=new Intent(getApplicationContext(),Connection.class);
                    startActivity(intent);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        tread.start();*/



       BoutonAuthentifier= (Button) findViewById(R.id.btnauthentification);


    BoutonAuthentifier.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent ouvrir=new Intent(getApplicationContext(),Connection.class);
        startActivity(ouvrir);
        }
});

    }

}