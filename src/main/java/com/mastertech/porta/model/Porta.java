package com.mastertech.porta.model;

import javax.persistence.*;

@Entity
@Table
public class Porta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String andar;
    private String sala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
