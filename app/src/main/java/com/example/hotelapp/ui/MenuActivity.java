package com.example.hotelapp.ui;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.hotelapp.R;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hotelapp.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        Button btnHabitaciones = findViewById(R.id.btnHabitaciones);
        Button btnReservas = findViewById(R.id.btnReservas);
        Button btnClientes = findViewById(R.id.btnClientes);
        Button btnCerrarSesion = findViewById(R.id.btnCerrarSesion);

        btnHabitaciones.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, HabitacionesActivity.class);
            startActivity(intent);
        });
        btnReservas.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ReservasActivity.class);
            startActivity(intent);
        });
        btnClientes.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, ClientesActivity.class);
            startActivity(intent);
        });
        btnCerrarSesion.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}