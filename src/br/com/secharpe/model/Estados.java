package br.com.secharpe.model;

public class Estados {
    private int codigo;
    private String nome;
    private String sigla;

    public Estados(int codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Cidades:\n" + "Código=" + codigo + "nNome=" + nome + "\nSigla=" + sigla;
    }

    
}
