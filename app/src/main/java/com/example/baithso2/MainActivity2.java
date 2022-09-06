package com.example.baithso2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btback;
    double soa,sob;
    TextView textketqua;
    double ketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btback = findViewById(R.id.btnback);
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(i);
            }
        });
        soa = Bundle.EMPTY.getDouble("so1");
        sob = Bundle.EMPTY.getDouble("so2");
        textketqua = findViewById(R.id.txtketqua);
        ketqua = soa+sob;
        textketqua.setText(String.valueOf(ketqua));
    }
}