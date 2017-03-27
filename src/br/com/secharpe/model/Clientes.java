package br.com.secharpe.model;

/**
 *
 * @author Luan Darabas
 * @author Luiz Alexandre da Luz
 */
public class Clientes {

    private int codigo;
    private String nome;
    private String email;
    private String rg;
    private int cpf;
    private int telefone;
    private int celular;
    //Informações Endereço
    private String cidade;
    private String bairro;
    private String endereco;
    private int numero;
    private int complemento;

    public Clientes(int codigo, String nome, String email, String rg, int cpf, int telefone, int celular, String cidade, String bairro, String endereco, int numero, int complemento) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.cidade = cidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getRg() {
        return rg;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public int getCelular() {
        return celular;
    }

    public String getCidade() {
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

    public int getComplemento() {
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

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCidade(String cidade) {
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

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Clientes:n" + "Código: " + codigo + "\nNome: " + nome + "\nE-mail: " + email + "\nRG: " + rg + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nCelular=" + celular + "\nCidade: " + cidade + "Bairro: " + bairro + "\nEndereco: " + endereco + "\nNúmero: " + numero + "\nComplemento: " + complemento;
    }

}
