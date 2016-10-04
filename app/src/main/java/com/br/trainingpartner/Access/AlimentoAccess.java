package com.br.trainingpartner.Access;

import com.br.trainingpartner.Connection.Connection;
import com.br.trainingpartner.Model.Alimento;
import com.br.trainingpartner.Utils.ReaderJson;

import org.json.JSONArray;

import java.util.List;

/**
 * Created by LGPC on 02/10/2016.
 */
public class AlimentoAccess {
    private Connection connection = Connection.getInstance();
    private final String URL = "http://192.168.1.3:8080/controle-dieta/api/alimentos/";

}
