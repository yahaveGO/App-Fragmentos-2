package com.example.appfragmentos2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.buttonAmarillo:
                Bundle bundle = new Bundle();
                bundle.putString("nombre", "Yahave");
                bundle.putString("saludo", "Hola amigos");
                FragmentUno uno = new FragmentUno();
                uno.setArguments(bundle);
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, uno).commit();
                Toast.makeText(this, "Amarillo", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonAzul:
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, FragmentDos.newInstance("Yaha", "Saludos azul")).commit();
                Toast.makeText(this, "Azul", Toast.LENGTH_LONG).show();
                break;

            case R.id.buttonVerde:
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.contenedor, FragmentTres.newInstance("Tres", "bienvenido"));
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

        }
    }

}