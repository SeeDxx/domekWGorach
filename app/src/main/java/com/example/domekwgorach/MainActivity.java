package com.example.domekwgorach;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button polub;
    private Button usun;
    private Button zapisz;
    private TextView licznik;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        polub = findViewById(R.id.polub);
        usun = findViewById(R.id.usun);
        zapisz = findViewById(R.id.zapisz);
        licznik = findViewById(R.id.licznik);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                licznik.setText(count + " polubień");
            }
        });
        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                if (count < 0){
                    count = 0;
                }
                licznik.setText(count + " polubień");
            }
        });
    }
}