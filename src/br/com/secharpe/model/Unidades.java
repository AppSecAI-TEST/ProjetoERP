package br.com.secharpe.model;

public class Unidades {

    private int codigo;
    private String nome;
    private String sigla;

    public Unidades(int codigo, String nome, String sigla) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Unidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nSigla: " + sigla;
    }

}
