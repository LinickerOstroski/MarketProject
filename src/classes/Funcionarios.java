package classes;

public class Funcionarios extends Pessoa implements Financeiro{

    private static int identificadorEstatico;
    private int idFuncionarios;
    private String funcao;
    private double salario;

    public Funcionarios(String nome, int idade, String cpf, String sexo, String endereco, String telefone, String funcao, double salario) {
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.idFuncionarios = this.identificadorEstatico;
        this.identificadorEstatico++;
        this.funcao = funcao;
        this.salario = salario;

    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void receberSalario(double quantidade) {
        this.salario += quantidade;
    }
    

}
