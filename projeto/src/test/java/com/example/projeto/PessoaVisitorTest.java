package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaVisitorTest {

    @Test
    void deveExibirRequisitante() {
        Requisitante requisitante = new Requisitante(1521, "Maria", new Embaixada("Estados Unidos"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Requisitante{passaporte=1521, nome='Maria', embaixada=Estados Unidos}", visitor.exibir(requisitante));
    }

    @Test
    void deveExibirProfessor() {
        Pais pais = new Pais(1814, "Estados Unidos", "América do Norte");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Pais{registro=1814, nome='Estados Unidos', continente='América do Norte'}", visitor.exibir(pais));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(1960, "Luis", 7000.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{codigo=1960, nome='Luis', salario=7000.0}", visitor.exibir(funcionario));
    }

}
