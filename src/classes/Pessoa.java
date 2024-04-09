package classes;

abstract class Pessoa{

    private String nome;
    private int idade;
    private String cpf;
    private String sexo;
    private String endereco;
    private String telefone;
    

    public Pessoa(String nome, int idade, String cpf, String sexo, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return
                "Nome: " + this.nome + "\n"
                + "Idade: " + this.idade + "\n"
                + "CPF: " + this.cpf + "\n"
                + "Endereço: " + this.endereco + "\n"
                + "Sexo: " + this.sexo + "\n"
                + "Telefone: " + this.telefone + "\n ----- \n"; 
    }
}
