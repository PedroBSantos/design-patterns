package com.head.first.cache;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AlunoRepositoryImpl implements AlunoRepository {

    private Set<Aluno> alunos;

    public AlunoRepositoryImpl() {
        this.alunos = new HashSet<Aluno>();
    }

    @Override
    public boolean adicionar(Aluno aluno) {
        return this.alunos.add(aluno);
    }

    @Override
    public List<Aluno> listar() {
        return this.alunos.stream().toList();
    }

    @Override
    public boolean remover(Aluno aluno) {
        return this.alunos.remove(aluno);
    }
}
