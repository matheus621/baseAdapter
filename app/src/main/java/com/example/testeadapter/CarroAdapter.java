package com.example.testeadapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CarroAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Carro> lista;

    public CarroAdapter(Context context, ArrayList<Carro> lista){
        this.context = context;
        this.lista = lista;
    }


    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position){
        return lista.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        Carro carro = lista.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.carro, null);

        ImageView iv = (ImageView) layout.findViewById(R.id.iv);
        iv.setImageResource(carro.getCarroImagem(position));

        TextView modelo = (TextView) layout.findViewById(R.id.t1);
        modelo.setText(carro.getModelo());

        TextView marca = (TextView) layout.findViewById(R.id.t2);
        marca.setText(carro.getMarca());

        if(position % 2 == 0){
            layout.setBackgroundColor(Color.CYAN);
        }

        return layout;
    }
}
