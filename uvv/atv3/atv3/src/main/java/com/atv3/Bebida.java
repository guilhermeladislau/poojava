public class Bebida extends Produto {
    private int quantidadeEstoque;

    public Bebida() {
        super();
    }

    public Bebida(int codigo, String nome, double valor, int quantidadeEstoque) {
        super(codigo, nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    void darEntrada(int quantidade) {
        if (quantidade < 0) {
            this.quantidadeEstoque += quantidade;
        }else {
            System.out.println("Quantidade inválida para dar entrada.");
        }
    }

    void darBaixa(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Quantidade inválida para dar saída.");
        }
    }


    @Override
    public String toString() {
        return "Bebida{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", valor=" + getValor() +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
