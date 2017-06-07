package br.com.secharpe.model;


/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */

public class Produtos {
    private int Codigo;
    private int CodigoInterno;
    private String Nome;
    private String Descrição;
    private int EstoqueAtual;
    private int EstoqueMin;
    private float PreçoCusto;
    private float PreçoFinal;
    private String Tipo;
    private String Fabricante;
    private String Unidade;
    private int Lucro;
    
    public int getLucro(){
        return Lucro;
    }
    
    public void setLucro(int lucro){
        this.Lucro = lucro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String Unidade) {
        this.Unidade = Unidade;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setCodigoInterno(int CodigoInterno) {
        this.CodigoInterno = CodigoInterno;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public void setEstoqueAtual(int EstoqueAtual) {
        this.EstoqueAtual = EstoqueAtual;
    }

    public void setEstoqueMin(int EstoqueMin) {
        this.EstoqueMin = EstoqueMin;
    }

    public void setPreçoCusto(float PreçoCusto) {
        this.PreçoCusto = PreçoCusto;
    }

    public void setPreçoFinal(float PreçoFinal) {
        this.PreçoFinal = PreçoFinal;
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getCodigoInterno() {
        return CodigoInterno;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescrição() {
        return Descrição;
    }

    public int getEstoqueAtual() {
        return EstoqueAtual;
    }

    public int getEstoqueMin() {
        return EstoqueMin;
    }

    public float getPreçoCusto() {
        return PreçoCusto;
    }

    public float getPreçoFinal() {
        return PreçoFinal;
    }

    @Override
    public String toString() {
        return "Produtos:\n" + "Codigo: " + Codigo + "\nCodigoInterno=" + CodigoInterno + ", Nome=" + Nome + ", Descri\u00e7\u00e3o=" + Descrição + ", EstoqueAtual=" + EstoqueAtual + ", EstoqueMin=" + EstoqueMin + ", Pre\u00e7oCusto=" + PreçoCusto + ", Pre\u00e7oFinal=" + PreçoFinal + ", Tipo=" + Tipo + ", Fabricante=" + Fabricante + ", Unidade=" + Unidade + '}';
    }

    
    
}
