package com.example.baithso2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btketqua;
    EditText txtso1,txtso2;
    int txtsoa,txtsob,a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btketqua =findViewById(R.id.btnketqua);
        btketqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                txtso1 = findViewById(R.id.text1);
                txtso2 = findViewById(R.id.text2);

                a = Integer.parseInt(txtso1.getText().toString());
                b = Integer.parseInt(txtso2.getText().toString());

                Bundle bundle = new Bundle();

                bundle.putDouble("so1",a);
                bundle.putDouble("so2",b);
                i.putExtra("MyPackage", bundle);
                startActivity(i);
            }
        });


    }
}