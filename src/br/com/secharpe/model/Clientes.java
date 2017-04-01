package br.com.secharpe.model;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */

public class Clientes {
    //Informação Sistema
    private int codigo;
    
    //Informações do Cliente
    private String nome;
    private String email;
    private int cpf;
    private int rg;
    private int telefone;
    private int celular;
    
    //Informações Endereço
    private Estados estado;
    private Cidades cidade;
    private String bairro;
    private String endereco;
    private int numero;
    private String complemento;

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCpf() {
        return cpf;
    }

    public int getRg() {
        return rg;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCelular() {
        return celular;
    }

    public Estados getEstado() {
        return estado;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
    @Override
    public String toString() {
        return "Clientes:\n" + "Codigo Interno:" + codigo + "\nNome: " + nome + "\nEmail: " + email + "\nCPF: " + cpf + "\nRG: " + rg + "\nTelefone: " + telefone + "\nCelular: " + celular + "\nEstado: " + estado.getNome() + "\nCidade:" + cidade.getNome() + "\nBairro: " + bairro + "\nEndereço: " + endereco + "\nNumero: " + numero + "\nComplemento: " + complemento;
    }
    
    
}
