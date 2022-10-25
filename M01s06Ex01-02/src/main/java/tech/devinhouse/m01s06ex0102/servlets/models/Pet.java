package tech.devinhouse.m01s06ex0102.servlets.models;

import lombok.Data;

@Data
public class Pet {
    private static int sequencia = 0;

    private Integer id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String alimentoPreferido;

    public Pet(){
        this.id = generateId();
    }

    private Integer generateId() {
    return ++sequencia;
    }
}

