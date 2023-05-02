package com.example.finddoccusco.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finddoccusco.R;
import com.example.finddoccusco.cards.Categoria;


import java.util.ArrayList;

public class CategoriaAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Categoria> categorias;

    public CategoriaAdapter(Context context, ArrayList<Categoria> categorias) {
        this.context = context;
        this.categorias = categorias;
    }

    @Override
    public int getCount() {
        return this.categorias.size();
    }

    @Override
    public Object getItem(int position) {
        return this.categorias.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int posicion , View view, ViewGroup parent) {
        TextView txtTtitulo;
        ImageView imgdestino;

        View convertView;

        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); // inflador dentro del layout
            convertView = inflater.inflate(R.layout.categoria_card,parent,false);
        } else {
            convertView = view;
        }
        txtTtitulo = convertView.findViewById(R.id.txtNombreCategoria);
        //imgdestino = convertView.findViewById(R.id.imgMedico);

        txtTtitulo.setText(categorias.get(posicion).getNombre());
        //imgdestino.setImageResource(categorias.get(posicion).getImagen());
        return convertView;
    }

}
