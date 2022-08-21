package com.head.first.cache;

import java.util.List;

public class AlunoRepositoryDecoratorCache extends AlunoRepositoryDecorator {

    private List<Aluno> alunosCaching;
    private boolean deveFazerCaching;

    public AlunoRepositoryDecoratorCache() {
        this.deveFazerCaching = false;
    }

    public AlunoRepositoryDecoratorCache(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    @Override
    public boolean adicionar(Aluno aluno) {
        this.deveFazerCaching = true;
        return this.alunoRepository.adicionar(aluno);
    }

    @Override
    public List<Aluno> listar() {
        if (!this.deveFazerCaching) {
            return this.alunoRepository.listar();
        }
        this.alunosCaching = this.alunoRepository.listar();
        this.deveFazerCaching = false;
        return this.alunosCaching;
    }

    @Override
    public boolean remover(Aluno aluno) {
        this.deveFazerCaching = true;
        return this.alunoRepository.remover(aluno);
    }
}
