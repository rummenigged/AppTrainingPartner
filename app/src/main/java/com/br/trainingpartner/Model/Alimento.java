package com.br.trainingpartner.Model;

import java.util.List;

/**
 * Created by LGPC on 08/06/2016.
 */
public class Alimento {
    private int id;
    private String nome;
    private int grupoAlimentar;
    private int tabelaNutricional;

    public Alimento(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGrupoAlimentar() {
        return grupoAlimentar;
    }

    public void setGrupoAlimentar(int grupoAlimentar) {
        this.grupoAlimentar = grupoAlimentar;
    }

    public int getTabelaNutricional() {
        return tabelaNutricional;
    }

    public void setTabelaNutricional(int tabelaNutricional) {
        this.tabelaNutricional = tabelaNutricional;
    }
}
