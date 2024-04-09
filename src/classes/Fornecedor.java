package classes;

public class Fornecedor extends Pessoa{

    private Categorias categoriaFornecida;
    private static int identificadorEstatico;
    private int idFornecedor;

    public Fornecedor(String nome, int idade, String cpf, String sexo, String endereco, String telefone, Categorias categoria) {   
        super(nome, idade, cpf, sexo, endereco, telefone);
        this.categoriaFornecida = categoria;
        this.idFornecedor = this.identificadorEstatico;
        this.identificadorEstatico++;
    }

    public Categorias getCategoria() {
        return categoriaFornecida;
    }

    public void setCategoria(Categorias categoria) {
        this.categoriaFornecida = categoria;
    }

    @Override
    public String toString(){
        return
                "Fornecedor" + this.idFornecedor + "\n"
                + "Categoria Fornecida: " + this.categoriaFornecida.getTipoCategoria()
                + super.toString();
    }
}
