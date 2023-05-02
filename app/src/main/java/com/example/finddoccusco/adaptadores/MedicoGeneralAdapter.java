package com.example.finddoccusco.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.finddoccusco.R;
import com.example.finddoccusco.cards.MedicoGeneral;

import java.util.ArrayList;

public class MedicoGeneralAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MedicoGeneral> medicosGenerales;

    public MedicoGeneralAdapter(Context context, ArrayList<MedicoGeneral> medicosGenerales) {
        this.context = context;
        this.medicosGenerales = medicosGenerales;
    }

    @Override
    public int getCount() {
        return this.medicosGenerales.size();
    }

    @Override
    public Object getItem(int position) {
        return this.medicosGenerales.get(position);
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
            convertView = inflater.inflate(R.layout.medico_card,parent,false);
        } else {
            convertView = view;
        }
        txtTtitulo = convertView.findViewById(R.id.txtNombreMedico);
        imgdestino = convertView.findViewById(R.id.imgMedico);

        //asignar y capturar
        txtTtitulo.setText(medicosGenerales.get(posicion).getNombre());
        imgdestino.setImageResource(medicosGenerales.get(posicion).getImagen());
        return convertView;
    }

}
