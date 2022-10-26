package tech.devinhouse.m01s06ex0102.servlets.models;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Tutor {

    private static int sequencia = 0;

    private final Integer id;
    private String nome;
    private Integer idade;


    public Tutor() {
        this.id = generateId();
    }

    public Tutor(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    private Integer generateId() {
        return ++sequencia;
    }
}

