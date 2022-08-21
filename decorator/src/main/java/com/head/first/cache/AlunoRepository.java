package com.head.first.cache;

import java.util.List;

public interface AlunoRepository {

    boolean adicionar(Aluno aluno);

    boolean remover(Aluno aluno);

    List<Aluno> listar();
}
