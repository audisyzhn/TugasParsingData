package com.example.tugasparsingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    ImageButton gofood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gofood = (ImageButton)findViewById(R.id.gofood);
        gofood.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.gofood:
                Intent explicit = new Intent(MainActivity.this, GoFoodActivity.class);
                startActivity(explicit);
                break;
        }
    }
}
