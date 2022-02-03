package program;

import java.util.Arrays;

public class Receita {
    int id;
    private String nomeReceita;
    private double tempoDePreparo;
    private Categoria categoria;
    private Rendimento rendimento;
    private Ingrediente[] ingrediente = new Ingrediente[5];
    private Preparo[] preparo = new Preparo[5];

    public Receita(int id, String nomeReceita, double tempoDePreparo, Categoria categoria, Rendimento rendimento) {
        this.id = id;
        this.nomeReceita = nomeReceita;
        this.tempoDePreparo = tempoDePreparo;
        this.categoria = categoria;
        this.rendimento = rendimento;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public void setTempoDePreparo(double tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setRendimento(Rendimento rendimento) {
        this.rendimento = rendimento;
    }

    public void setIngrediente(Ingrediente[] ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setPreparo(Preparo[] preparo) {
        this.preparo = preparo;
    }

    @Override
    public String toString() {
        return "Receita:\t" + id
                + "\nNome:\t\t" + nomeReceita
                + "\nCategoria:\t" + categoria.getCategoria()
                + "\nTempo Preparo:\t" + tempoDePreparo + " Minutos"
                + "\nRendimento:\t" + rendimento
                + "\nIngredientes: "+ Arrays.toString(ingrediente).replaceAll("[\\[\\]{}\\,]","")
                + "\nModo de Preparo: " + Arrays.toString(preparo).replaceAll("[\\[\\](){}\\,]","");
    }
}
