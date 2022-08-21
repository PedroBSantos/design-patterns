package com.head.first.cache;

import java.util.List;

public abstract class AlunoRepositoryDecorator implements AlunoRepository {

    protected AlunoRepository alunoRepository;

    @Override
    public abstract boolean adicionar(Aluno aluno);

    @Override
    public abstract boolean remover(Aluno aluno);

    @Override
    public abstract List<Aluno> listar();
}
