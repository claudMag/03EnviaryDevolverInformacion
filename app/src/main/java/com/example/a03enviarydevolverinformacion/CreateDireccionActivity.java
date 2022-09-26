package com.example.a03enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a03enviarydevolverinformacion.modelos.Direccion;

public class CreateDireccionActivity extends AppCompatActivity {

    private EditText txtCalle;
    private EditText txtNumero;
    private EditText txtCiudad;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_direccion);

        inicializaVistas();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Direccion dir = new Direccion(
                        txtCalle.getText().toString(),
                        Integer.parseInt(txtNumero.getText().toString()),
                        txtCiudad.getText().toString()
                );

                // intent de almacenaje solo, estoy retornando
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putSerializable("DIR", dir);
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                //de que ventana viene es decir que ventana se cierra para que vuelva el main
                //con esto vuelve al main:
                finish();
            }
        });
    }

    private void inicializaVistas() {

        txtCalle.findViewById(R.id.txtCalleCreateDir);
        txtNumero.findViewById(R.id.txtNumeroCreateDir);
        txtCiudad.findViewById(R.id.txtCiudadCreateDir);
        btnCrear.findViewById(R.id.btnCrearDireccionCreateDir);
    }
}