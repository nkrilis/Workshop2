package com.example.nkrilis.workshop2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a2_button =  (Button) findViewById(R.id.a2_button);

        a2_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent second = new Intent ("com.seneca.lab2b.nkrilis");
                startActivityForResult(second,1);
            }

        });

        Button a3_button =  (Button) findViewById(R.id.a3_button);

        a3_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent third = new Intent ("com.seneca.lab2b.nkrilis");
                startActivityForResult(third,1);
            }

        });





    }

}
