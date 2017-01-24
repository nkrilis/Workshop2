package com.example.nkrilis.workshop2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button okbutton =  (Button) findViewById(R.id.ok_button);

        okbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                EditText editText = (EditText) findViewById(R.id.editText);
                String usermessage = editText.getText().toString();
                Intent replyIntent = new Intent();
                replyIntent.putExtra("message", usermessage);
                setResult(Activity.RESULT_OK, replyIntent);
            }

        });
    }
}
