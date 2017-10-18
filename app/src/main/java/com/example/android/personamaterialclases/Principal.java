package com.example.android.personamaterialclases;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private RecyclerView listado;
    private ArrayList<Persona> personas;
    private AdaptadorPersona adapter;
    private LinearLayoutManager llm;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
         listado = (RecyclerView)findViewById(R.id.toolbar);
        res = this.getResources();
        personas = new ArrayList<>();
        personas.add(new Persona(R.drawable.images2,"1142568795", "isaac", "vasquez",2));
        personas.add(new Persona(R.drawable.images3,"1142568795", "alfre", "vasquez",2));
        personas.add(new Persona(R.drawable.images,"1142568795", "lis", "vasquez",2));
        personas.add(new Persona(R.drawable.images2,"1142568795", "gustabo", "vasquez",2));
        personas.add(new Persona(R.drawable.images3,"1142568795", "carlos", "vasquez",2));
        personas.add(new Persona(R.drawable.images,"1142568795", "isa", "vasquez",2));
        personas.add(new Persona(R.drawable.images2,"1142568795", "isaac", "vasquez",2));
        personas.add(new Persona(R.drawable.images3,"1142568795", "isaac", "vasquez",2));
        personas.add(new Persona(R.drawable.images,"1142568795", "isaac", "vasquez",2));

        adapter = new AdaptadorPersona(this, personas);
        llm = new LinearLayoutManager(this);
        listado.setLayoutManager(llm);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
    }

  public void click(View v){
      Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
              .setAction("Action", null).show();

  }
}
