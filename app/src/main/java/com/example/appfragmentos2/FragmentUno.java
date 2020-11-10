package com.example.appfragmentos2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentUno extends Fragment {
    // TODO: Rename and change types of parameters
    private String nombre;
    private String saludo;

    public FragmentUno() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            nombre = getArguments().getString("nombre");
            saludo = getArguments().getString("saludo");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_uno, container, false);
        TextView tvNombre = v.findViewById(R.id.tvNombre);
        TextView tvSaludo = v.findViewById(R.id.tvSalida);
        tvNombre.setText(nombre);
        tvSaludo.setText(saludo);
        return v;
    }
}