package com.example.a03enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a03enviarydevolverinformacion.modelos.Usuario;

public class DescifrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descifrar);

        //get intent metodo propio de la actividad
        Intent intent = this.getIntent();

        Bundle bundle = intent.getExtras();

        if (bundle != null){
            Usuario user = (Usuario) bundle.getSerializable("USER");
            //String password = bundle.getString("PASS");
            //String email = bundle.getString("EMAIL");
            //Usuario user = new Usuario(email, password);
            Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}