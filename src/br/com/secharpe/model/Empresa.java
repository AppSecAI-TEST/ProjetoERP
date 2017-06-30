package br.com.secharpe.model;

/* Classe de Empresa
 *
 * @author luandr <stringigualanull@outlook.com>
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class Empresa {

    private int codigo;
    private String nomeEmpresarial;
    private String nomeFantasia;
    private long CNPJ;
    private String logradouro;
    private String bairro;
    private Cidades cidade;
    private int numero;
    private String complemento;
    private String site;
    private String email;
    private long telefone;

    public int getCodigo() {
        return codigo;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public Cidades getCidade() {
        return cidade;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getSite() {
        return site;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(Cidades cidade) {
        this.cidade = cidade;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Empresa:\n" + "Código: " + codigo + "\nNome Empresarial: " + nomeEmpresarial + "\nNomeFantasia: " + nomeFantasia + "\nCNPJ: " + CNPJ + "\nLogradouro: " + logradouro + "\nBairro: " + bairro + "\nCidade: " + cidade.getNome() + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nSite: " + site + "\nE-mail: " + email + "\nTelefone: " + telefone;
    }

}
