package com.example.hotelapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelapp.R;

public class ClientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_clientes);

        Button btnVolver = findViewById(R.id.btnVolverClientes);

        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(ClientesActivity.this, MenuActivity.class);
            startActivity(intent);
            finish();
        });
    }
}