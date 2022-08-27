package com.head.first.migration;

import java.time.LocalDate;
import java.util.UUID;

public class Aluno {

    private UUID id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate dataNascimento;

    public Aluno(UUID id, String nome, String email, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}
