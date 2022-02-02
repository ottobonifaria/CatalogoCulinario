package program;

public class Rendimento {
    private int quantidade;
    private Tipo tipo;

    public Rendimento(int quantidade, Tipo tipo) {
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return quantidade + " " + tipo;
    }

    public void alteraRendimento(int quantidade, Tipo tipo) {
        setQuantidade(quantidade);
        setTipo(tipo);
    }
}
