package br.com.secharpe.model;

public class Cidades {
    private int codigo;
    private String nome;
    private int estado;

    public Cidades(int codigo, String nome, int estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nEstado: " + estado;
    }

    
}
