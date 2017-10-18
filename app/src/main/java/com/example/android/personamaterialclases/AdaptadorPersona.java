package com.example.android.personamaterialclases;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 17/10/2017.
 */

public class AdaptadorPersona extends RecyclerView.Adapter<AdaptadorPersona.PersonaViewHolder> {

    private ArrayList<Persona> personas = new ArrayList<>();
    private Resources res;
     public AdaptadorPersona (Context)


    @Override

    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.iten_persona, parent, false);
        return new PersonaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        final Persona p =personas.get(position);
        holder.foto.setImageDrawable(ResourcesCompat.getDrawable(res,p.getFoto(),null));



    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder{
        private ImageView foto;
        private TextView cedula;
        private TextView nombre;
        private TextView apellido;

        public PersonaViewHolder(View item){
            super(item);
            foto = (ImageView)item.findViewById(R.id.imgFoto);
            cedula = (TextView) item.findViewById(R.id.lblCedula);
            nombre = (TextView) item.findViewById(R.id.lblNombre);
            apellido  = (TextView) item.findViewById(R.id.lblApellidos);
        }
    }
}
