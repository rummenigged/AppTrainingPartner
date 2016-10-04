package com.br.trainingpartner.Connection;

import android.util.Log;

import com.br.trainingpartner.Utils.ReaderJson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by LGPC on 02/10/2016.
 */
public class Connection {

    private static final Connection instance = new Connection();
    HttpURLConnection connection;
    URL urlStart;
    int codigoResposta;
    public static Connection getInstance(){
        return instance;
    }

    /*
    public HttpURLConnection connect(String url){
        try {
          urlStart = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
             connection = (HttpURLConnection) urlStart.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }

        return connection;
    }

    public void disconnect(){
        connection.disconnect();
    }
*/

    public String get(String url){
        JsonArray resultArray = null;
        InputStream result = null;
        String retorno = null;
        try {
            urlStart = new URL(url);
            connection = (HttpURLConnection) urlStart.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(15000);
            connection.setReadTimeout(1500);
            connection.connect();

            codigoResposta = connection.getResponseCode();

            if(codigoResposta < HttpURLConnection.HTTP_BAD_REQUEST){
                result = connection.getInputStream();
            }else{
                result = connection.getErrorStream();
            }

            Log.d("Result Stream", ReaderJson.toStreamFromString(result));
            retorno = ReaderJson.toStreamFromString(result);
            result.close();

        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }

        return retorno;
    }

    public JsonArray post(String url){
        JsonArray resultArray = null;

        return resultArray;
    }

    public JsonArray put(String url){
        JsonArray resultArray = null;

        return resultArray;
    }

    public JsonArray delete(String url){
        JsonArray resultArray = null;

        return resultArray;
    }
}
