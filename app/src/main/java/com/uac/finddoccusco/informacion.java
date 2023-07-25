package com.uac.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.uac.finddoccusco.adaptadores.CategoriaAdapter;
import com.uac.finddoccusco.cards.Categoria;
import com.uac.finddoccusco.util.Medicos;

import java.util.ArrayList;

public class informacion extends AppCompatActivity {


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

    }*/


    private ArrayList<Categoria> categorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this.setTitle("Medicos Generales en el Cusco");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_categorias);
        ListView listaCategorias = findViewById(R.id.listaCategorias);
        this.categorias = new ArrayList<Categoria>();
        categorias.add(new Categoria("Médicos generales", R.drawable.docm, Medicos.filterMedicos("General")));
        categorias.add(new Categoria("Gastroenterólogos", R.drawable.docm, Medicos.filterMedicos("Gastroenterólogo")));
        categorias.add(new Categoria("Médicos cirujanos", R.drawable.doch, Medicos.filterMedicos("Cirujano")));
        categorias.add(new Categoria("Médicos legistas", R.drawable.doch, Medicos.filterMedicos("Legista")));
        categorias.add(new Categoria("Biólogos", R.drawable.doch, Medicos.filterMedicos("Biólogo")));
        categorias.add(new Categoria("Psiquiatras", R.drawable.doch, Medicos.filterMedicos("Psiquiatra")));
        categorias.add(new Categoria("Pediatras", R.drawable.doch, Medicos.filterMedicos("Pediatra")));
        categorias.add(new Categoria("Médicos internistas", R.drawable.doch, Medicos.filterMedicos("Internista")));
        categorias.add(new Categoria("Neumólogos", R.drawable.doch, Medicos.filterMedicos("Neumólogo")));
        categorias.add(new Categoria("Patólogos", R.drawable.doch, Medicos.filterMedicos("Patólogo")));
        listaCategorias.setAdapter(new CategoriaAdapter(this, categorias));
        listaCategorias.setOnItemClickListener((adapterView, view, i, l) -> this.itemClickHandler(i));
    }

    public void itemClickHandler(int position) {
        Categoria categoria = categorias.get(position);
        if (categoria != null) {
            Intent intent = new Intent(informacion.this, ListaMedicos.class);
            intent.putExtra("categoria", categoria.getNombre());
            intent.putExtra("imagenCategoria", categoria.getImagen());
            intent.putParcelableArrayListExtra("medicos", categoria.getMedicos());
            startActivity(intent);
        }

    }


}