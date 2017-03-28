package br.com.secharpe.model;

public class Cidades {
    private int codigo;
    private String nome;
    private Estados estado;

    public Cidades(int codigo, String nome, Estados estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Cidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nEstado: " + estado.getNome();
    }

    String getNome() {
        return this.nome;
=======
        return "Cidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nEstado: " + estado;
>>>>>>> origin/master
    }

    
}
