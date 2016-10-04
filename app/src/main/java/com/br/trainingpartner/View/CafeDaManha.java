package com.br.trainingpartner.View;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.trainingpartner.Adapter.AlimentosAdapter;
import com.br.trainingpartner.Model.Alimento;
import com.br.trainingpartner.R;

import java.util.List;

/**
 * Created by LGPC on 27/05/2016.
 */
public class CafeDaManha extends AppCompatActivity{

    RecyclerView rv;
    FloatingActionButton fab;
    LinearLayoutManager layoutManager;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_dieta);

        rv = (RecyclerView) findViewById(R.id.rv);
        fab = (FloatingActionButton) findViewById(R.id.fb_dieta);

        rv.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);

    }

    private AlimentosAdapter getAdapter(List<Alimento> alimentoList){
        AlimentosAdapter adapter = new AlimentosAdapter(this, alimentoList);

        return adapter;
    }
}
