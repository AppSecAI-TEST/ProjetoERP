package br.com.secharpe.model;

public class Empresa {

    private int codigo;
    private String nomeEmpresarial;
    private String nomeFantasia;
    private long CNPJ;
    private String logradouro;
    private String bairro;
    private Cidades cidade;
    private int numero;
    private int complemento;
    private String site;
    private String email;
    private long telefone;

    public Empresa(int codigo, String nomeEmpresarial, String nomeFantasia, long CNPJ, String logradouro, String bairro, Cidades cidade, int numero, int complemento, String site, String email, long telefone) {
        this.codigo = codigo;
        this.nomeEmpresarial = nomeEmpresarial;
        this.nomeFantasia = nomeFantasia;
        this.CNPJ = CNPJ;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.complemento = complemento;
        this.site = site;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Empresa:\n" + "Código: " + codigo + "\nNome Empresarial: " + nomeEmpresarial + "\nNomeFantasia: " + nomeFantasia + "\nCNPJ: " + CNPJ + "\nLogradouro: " + logradouro + "\nBairro: " + bairro + "\nCidade: " + cidade.getNome() + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nSite: " + site + "\nE-mail: " + email + "\nTelefone: " + telefone;
    }
    
}
