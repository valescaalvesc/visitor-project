package com.example.projeto;

public class PessoaVisitor implements Visitor{

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirRequisitante(Requisitante requisitante) {
        return "Requisitante{" +
                "passaporte=" + requisitante.getPassaporte() +
                ", nome='" + requisitante.getNome() + '\'' +
                ", embaixada=" + requisitante.getNomeEmbaixada() +
                '}';
    }

    @Override
    public String exibirPais(Pais pais) {
        return "Pais{" +
                "registro=" + pais.getRegistro() +
                ", nome='" + pais.getNome() + '\'' +
                ", continente='" + pais.getContinente() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }
}
