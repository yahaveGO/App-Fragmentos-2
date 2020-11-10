package com.example.appfragmentos2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentTres#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentTres extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "usuario";
    private static final String ARG_PARAM2 = "saludo";

    // TODO: Rename and change types of parameters
    private String usuario;
    private String saludo;

    public FragmentTres() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static FragmentTres newInstance(String usuario, String saludo) {
        FragmentTres fragment = new FragmentTres();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, usuario);
        args.putString(ARG_PARAM2, saludo);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            usuario = getArguments().getString(ARG_PARAM1);
            saludo = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tres, container, false);
        TextView tvUsuario = v.findViewById(R.id.tvSalida);
        tvUsuario.setText("Saludos" + usuario +", "+ saludo);
        return v;
    }
}