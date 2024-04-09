package classes;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    private static int identificadorEstatico;
    private int idCompra;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();

    public Compra(Produto produto) {
        this.cliente = cliente;
        this.idCompra = identificadorEstatico;
        identificadorEstatico++;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setOutrosProdutos(Produto produto) {
        produtos.add(produto);
    }

}
