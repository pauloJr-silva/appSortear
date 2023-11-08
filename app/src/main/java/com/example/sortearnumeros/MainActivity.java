package com.example.sortearnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear (View view){

        TextView numeroSorteado = findViewById(R.id.txtTexto);

        int numero = new Random().nextInt(11);

        numeroSorteado.setText("Numero: " + numero);
    }
}