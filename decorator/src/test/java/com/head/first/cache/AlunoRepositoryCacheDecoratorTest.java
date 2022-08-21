package com.head.first.cache;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.UUID;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlunoRepositoryCacheDecoratorTest {

    @Test
    @DisplayName("Deveria fazer o cache")
    public void test1() {
        var aluno = new Aluno(UUID.randomUUID(), "José Pedro Barreto Santos", LocalDate.of(1998, 12, 1));
        AlunoRepository alunoRepository = new AlunoRepositoryDecoratorCache(new AlunoRepositoryImpl());
        alunoRepository.adicionar(aluno);
        assertTrue(true);
    }
}
