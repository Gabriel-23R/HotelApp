package com.example.hotelapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelapp.R;

public class ReservasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_reservas);

        Button btnVolver = findViewById(R.id.btnVolverReservas);

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ReservasActivity.this, MenuActivity.class);
            startActivity(intent);
            finish();
        });
    }
}