package com.example.mihai.stringsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String str = getResources().getString(R.string.are_u_sure);
        Log.d("demo", str);

        String[] colors = getResources().getStringArray(R.array.colors);
        for (String s : colors) {
            Log.d("demo", s);
        }

        Button btn = (Button) findViewById(R.id.buttonOK);
        Log.d("demo", btn.getText().toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("demo", "Button OK clicked");
            }
        });


        Button btnCancel = (Button) findViewById(R.id.buttonCancel);
        findViewById(R.id.buttonCancel).setOnClickListener(this); //this says that the on click method is provided by the current class below


    }

    @Override
    public void onClick(View v) {
        Log.d("demo", "Button cancel cliked");
    }

    public void otherButtonClicked(View v){
        Log.d("demo", "other button clicked");
    }
}
