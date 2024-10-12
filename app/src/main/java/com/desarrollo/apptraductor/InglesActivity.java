package com.desarrollo.apptraductor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import com.desarrollo.apptraductor.databinding.ActivityInglesBinding;

public class InglesActivity extends AppCompatActivity {
    private ActivityInglesBinding binding;
    private Traductor traductor = new Traductor();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInglesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String laCadena = getIntent().getStringExtra("cadena");
        traductor.traducir(laCadena);
        traductor.getTraducida().observe(this, resultado->{
            binding.tvIngles.setText(resultado.getEnIng());
            binding.imgImagen.setImageResource(resultado.getImag());
        });

        binding.btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(InglesActivity.this, MainActivity.class);
                startActivity(intento);
            }
        });
    }
}