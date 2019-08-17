package com.example.tugasparsingdata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity implements View.OnClickListener {

    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(this);


        TextView alamat = findViewById(R.id.text_alamat);
        TextView nama = findViewById(R.id.text_nama);
        TextView pesan = findViewById(R.id.text_pesan);
        Bundle bundle=getIntent().getExtras();
        String s=bundle.getString("name");
        String a=bundle.getString("alamat");
        String p=bundle.getString("pesan");
        alamat.setText(a);
        nama.setText(s);
        pesan.setText(p);
    }
    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnSubmit:
                Intent explicit = new Intent(Result.this, MainActivity.class);
                startActivity(explicit);
                break;
        }
    }
}
