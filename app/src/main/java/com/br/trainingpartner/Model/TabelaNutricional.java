package com.br.trainingpartner.Model;

/**
 * Created by LGPC on 07/07/2016.
 */
public class TabelaNutricional {
    private  int id;
    private int proteinas;
    private int carboidratos;
    private int calorias;
    private int gordurasTotais;
    private int gordurasSaturadas;
    private int sodio;

    public TabelaNutricional(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public int getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(int carboidratos) {
        this.carboidratos = carboidratos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(int gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public int getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(int gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }
}
