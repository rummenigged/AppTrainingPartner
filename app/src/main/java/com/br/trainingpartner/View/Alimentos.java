package com.br.trainingpartner.View;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.br.trainingpartner.Adapter.AlimentosAdapter;
import com.br.trainingpartner.Controller.AlimentoController;
import com.br.trainingpartner.Model.Alimento;
import com.br.trainingpartner.R;

import java.util.List;

/**
 * Created by LGPC on 12/07/2016.
 */
public class Alimentos extends AppCompatActivity {

    private RecyclerView rv;
    private Toolbar  toolbar;
    private FloatingActionButton fab;
    private LinearLayoutManager layoutManager;
    private final Context CONTEXT = this;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alimentos);
        loadUIElements();

        setSupportActionBar(toolbar);
        toolbar.setTitle("Alimentos");

        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(layoutManager);

        getAlimentos();
    }

    private AlimentosAdapter getAdapter(Context context , List<Alimento> alimentoList){
        return new AlimentosAdapter(context, alimentoList);
    }

    private void getAlimentos(){

        new Thread(){

            @Override
            public void run() {
               //final List<Alimento> alimentos = AlimentoController.findById(2);
                final String result = AlimentoController.teste(2);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //AlimentosAdapter adapter  = new AlimentosAdapter(CONTEXT, alimentos);
                        //rv.setAdapter(adapter);
                    }
                });
            }
        }.start();
    }

    private void loadUIElements(){
        rv = (RecyclerView) findViewById(R.id.rv);
        fab = (FloatingActionButton) findViewById(R.id.fb_dieta);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
    }
}