package com.uac.finddoccusco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MedicoGeneralActivity extends AppCompatActivity {
    Button btn, btnUbicacion;
    ImageView imageView;
    TextView txtMedicoGeneralDetalle;
    TextView txtMedicoTelefono;
    TextView txtMedicoDireccion;
    TextView txtMedicoCorreo;
    TextView txtLunes, txtMartes, txtMiercoles, txtJueves, txtViernes, txtSabado, txtDomingo;

    private void inicializar() {
        imageView = findViewById(R.id.imgMedicoDetalle);
        txtMedicoGeneralDetalle = findViewById(R.id.txtMedicoGeneralDetalle);
        txtMedicoTelefono = findViewById(R.id.txtMedicoTelefono);
        txtMedicoDireccion = findViewById(R.id.txtMedicoDireccion);
        txtMedicoCorreo = findViewById(R.id.txtMedicoCorreo);
        txtLunes = findViewById(R.id.txtLunes);
        txtMartes = findViewById(R.id.txtMartes);
        txtMiercoles = findViewById(R.id.txtMiercoles);
        txtJueves = findViewById(R.id.txtJueves);
        txtViernes = findViewById(R.id.txtViernes);
        txtSabado = findViewById(R.id.txtSabado);
        txtDomingo = findViewById(R.id.txtDomingo);
    }

    private void establecerHorarios(ArrayList<String> horarios) {
        txtLunes.setText(horarios.get(0));
        txtMartes.setText(horarios.get(1));
        txtMiercoles.setText(horarios.get(2));
        txtJueves.setText(horarios.get(3));
        txtViernes.setText(horarios.get(4));
        txtSabado.setText(horarios.get(5));
        txtDomingo.setText(horarios.get(6));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medico_general);
        this.inicializar();

        String nombreMedico = getIntent().getStringExtra("nombre");
        int imagenMedico = getIntent().getIntExtra("imagen", 0);
        String direccion = getIntent().getStringExtra("direccion");
        String celular = getIntent().getStringExtra("celular");
        String correo = getIntent().getStringExtra("correo");
        ArrayList<String> horarios = getIntent().getStringArrayListExtra("horarios");
        double latitud = getIntent().getDoubleExtra("latitud", 0);
        double longitud = getIntent().getDoubleExtra("longitud", 0);
        String categoria = getIntent().getStringExtra("categoria");

        this.setTitle(String.format("Dr(a). %s", nombreMedico));
        this.establecerHorarios(horarios);

        imageView.setImageResource(imagenMedico);
        txtMedicoGeneralDetalle.setText(nombreMedico);
        txtMedicoDireccion.setText(direccion);
        txtMedicoCorreo.setText(correo);
        txtMedicoTelefono.setText(celular);

        btn = findViewById(R.id.btnContactoWpp);
        btnUbicacion = findViewById(R.id.btnUbicacion);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PackageManager pm = getPackageManager();
                //boolean isInstalled = isPackageInstalled("com.whatsapp", pm);
                boolean isInstalled = isWhatsAppInstalled();
                if (isInstalled) {
                    startActivity(
                            new Intent(Intent.ACTION_VIEW,
                                    Uri.parse(
                                            String.format("https://api.whatsapp.com/send?phone=%s&text=%s", String.format("+51%s", celular), "Hola!, tengo un consulta... ")
                                    )
                            )
                    );
                } else {
                    Toast.makeText(getApplicationContext(), "Aplicación no instalada", Toast.LENGTH_SHORT).show();
                }
                try {

                } catch (Error e) {

                }
            }
        });

        btnUbicacion.setOnClickListener((e) -> {
            if (latitud == 0 || longitud == 0) {
                Toast.makeText(getApplicationContext(), "Ubicación no disponible", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, ubicacion_docWison.class);
                intent.putExtra("latitud", latitud);
                intent.putExtra("longitud", longitud);
                intent.putExtra("categoria", categoria);
                intent.putExtra("nombre", nombreMedico);
                startActivity(intent);
            }

        });
    }

    private boolean isPackageInstalled(String packageName, PackageManager packageManager) {
        try {
            packageManager.getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    private boolean isWhatsAppInstalled() {
        try {
            // Try to create an intent with WhatsApp package name
            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + Uri.encode("")));
            intent.setPackage("com.whatsapp");
            startActivity(intent);
            return true;
        } catch (android.content.ActivityNotFoundException e) {
            return false;
        }
    }


}