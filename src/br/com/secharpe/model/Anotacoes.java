package br.com.secharpe.model;

public class Anotacoes {

    private int codigo;
    private String titulo;
    private String descricao;
    private String anotacao;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAnotacao() {
        return anotacao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAnotacao(String anotacao) {
        this.anotacao = anotacao;
    }

    @Override
    public String toString() {
        return "Anotacoes:\n" + "Código: " + codigo + "\nNome: " + titulo + "\nDescricao: " + descricao + "\nAnotacao: " + anotacao;
    }

}
