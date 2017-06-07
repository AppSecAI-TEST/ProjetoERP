package br.com.secharpe.model;

public class Cidades {

    private int codigo;
    private String nome;
    private Estados estado;
    private String siglaestado;
    
    public int getCodigo() {
        return codigo;
    }

    public Estados getEstado() {
        return estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEstadoSigla (String sestado){
        this.siglaestado = sestado;
    }
    
    public String getEstadoSgial (){
        return siglaestado;
    }
    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nEstado: " + estado.getNome();
    }

}
