package com.example.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.example.finddoccusco.adaptadores.MedicoGeneralAdapter;
import com.example.finddoccusco.cards.MedicoGeneral;

import java.util.ArrayList;

public class ListaMedicos extends AppCompatActivity {

    ArrayList<MedicoGeneral> medicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_medicos);

        String categoria = getIntent().getStringExtra("categoria");
        ArrayList<MedicoGeneral> lmedicos = getIntent().getParcelableArrayListExtra("medicos");
        this.medicos = lmedicos;
        ListView listaMedicos = findViewById(R.id.listaMedicosGenerales);
        //int imagenCategoria = getIntent().getIntExtra("imagenCategoria", 0);
        this.setTitle(categoria);
        TextView txtView = findViewById(R.id.txtNombreCategoriaDetalle);
        txtView.setText(categoria);
        listaMedicos.setAdapter(new MedicoGeneralAdapter(this, medicos));
        listaMedicos.setOnItemClickListener((adapterView, view, i, l) -> this.itemClickHandler(i));


    }

    public void itemClickHandler(int position) {
        MedicoGeneral medico = medicos.get(position);
        if (medico != null) {
            Intent intent = new Intent(ListaMedicos.this, MedicoGeneralActivity.class);
            intent.putExtra("nombre", String.format("%s %s", medico.getNombre(), medico.getApellidos()));
            intent.putExtra("correo", medico.getCorreo());
            intent.putExtra("celular", medico.getCelular());
            intent.putExtra("direccion", medico.getDireccion());
            intent.putExtra("latitud", medico.getLatitud());
            intent.putExtra("longitud", medico.getLongitud());
            intent.putStringArrayListExtra("horarios", medico.getHorarios());
            intent.putExtra("imagen", medico.getImagen());
            intent.putExtra("categoria", medico.getCategoria());
            startActivity(intent);
        }

    }

}