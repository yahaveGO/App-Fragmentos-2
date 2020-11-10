package com.example.appfragmentos2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentDos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentDos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "usuario";
    private static final String ARG_PARAM2 = "mensaje";

    // TODO: Rename and change types of parameters
    private String usuario;
    private String mensaje;

    public FragmentDos() {
        // Required empty public constructor
    }

    public static FragmentDos newInstance(String usuario, String mensaje) {
        FragmentDos fragment = new FragmentDos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, usuario);
        args.putString(ARG_PARAM2, mensaje);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            usuario = getArguments().getString(ARG_PARAM1);
            mensaje = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dos, container, false);
        TextView tvUsuario = v.findViewById(R.id.tvUsuario);
        TextView tvMensaje = v.findViewById(R.id.tvMensaje);
        tvUsuario.setText(usuario);
        tvMensaje.setText(mensaje);
        return v;
    }
}