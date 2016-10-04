package com.br.trainingpartner.Utils;

import android.util.Log;

import com.br.trainingpartner.Model.Alimento;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.internal.Primitives;
import com.google.gson.stream.JsonReader;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LGPC on 07/07/2016.
 */
public class ReaderJson {

    public static String toStreamFromString(InputStream stream){
        StringBuffer buffer = new StringBuffer();

        try{
            BufferedReader br;
            String linha;

            br = new BufferedReader(new InputStreamReader(stream));
            while((linha = br.readLine())!= null){
                buffer.append(linha);
            }

            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        return buffer.toString();
    }
    public static JsonArray parser(String input){
        //Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonArray array = (JsonArray) parser.parse(input);

        return array;
    }
    public static List<Alimento> toAlimento(JsonArray array){
        List<Alimento> list = new ArrayList<>();
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();

        for(JsonElement j : array){
            list.add(gson.fromJson(j, Alimento.class));
        }
        return list;
    }
}
