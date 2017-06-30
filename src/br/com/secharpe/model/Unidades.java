package br.com.secharpe.model;

/* Classe de Unidades
 *
 * @author luandr <stringigualanull@outlook.com>
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class Unidades {

    private int codigo;
    private String nome;
    private String sigla;

    public Unidades() {

    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Unidades:\n" + "Código: " + codigo + "\nNome: " + nome + "\nSigla: " + sigla;
    }

}
