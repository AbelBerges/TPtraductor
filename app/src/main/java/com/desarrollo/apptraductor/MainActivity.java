package com.desarrollo.apptraductor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.desarrollo.apptraductor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabra = binding.etEnEsp.getText().toString();
                Intent intento = new Intent(MainActivity.this, InglesActivity.class);
                intento.putExtra("cadena", palabra);
                startActivity(intento);
            }
        });
    }
}