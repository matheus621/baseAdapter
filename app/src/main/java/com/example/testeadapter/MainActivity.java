package com.example.testeadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Carro> carros = new ArrayList<Carro>();

        for(int i = 0; i < 5; i++){


            Carro carro = new Carro();
            carro.setModelo("Carro " +(i + 1));
            carro.setMarca("Marca " +(i + 1));

            carros.add(carro);
        }

        ListView lv = findViewById(R.id.lv);
        lv.setAdapter(new CarroAdapter(this, carros));
    }
    public void sair(View view){
        finish();
    }


}
