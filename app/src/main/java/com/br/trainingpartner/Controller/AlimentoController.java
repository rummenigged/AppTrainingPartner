package com.br.trainingpartner.Controller;

import android.util.Log;

import com.br.trainingpartner.Connection.Connection;
import com.br.trainingpartner.Model.Alimento;
import com.br.trainingpartner.Utils.ReaderJson;
import com.google.gson.JsonArray;

import java.util.List;

/**
 * Created by LGPC on 07/07/2016.
 */
public class AlimentoController {

    private Connection connection = Connection.getInstance();
    private static final String URL = "http://192.168.1.3:8080/controle-dieta/api/alimentos/";

    //public static List<Alimento> findById(int id) {

        //List<Alimento> list = ReaderJson.toAlimento(Connection.getInstance().get(URL + id));
        //Log.d("Passei no findById", "True");
        //Log.d("Lista[0]-", list.get(0).toString());

       // return list;
    //}

    public static String teste(int id) {

        String result = Connection.getInstance().get(URL);

        return result;
    }
}
