package program;

public class Ingrediente {
    private String nomeIngrediente;
    private double quantidadeIngrediente;
    private Tipo tipo;

    public Ingrediente(String nomeIngrediente, double quantidadeIngrediente, Tipo tipo) {
        this.nomeIngrediente = nomeIngrediente;
        this.quantidadeIngrediente = quantidadeIngrediente;
        this.tipo = tipo;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public void setQuantidadeIngrediente(double quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "\n\t" + nomeIngrediente + " (" + quantidadeIngrediente + " " + tipo.getTipo() + ")";
    }

    public void alteraIngredientes(String nome, double quantidade, Tipo tipo) {
        setNomeIngrediente(nome);
        setQuantidadeIngrediente(quantidade);
        setTipo(tipo);
    }
}
