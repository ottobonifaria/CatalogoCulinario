package program;

public enum Categoria {
    DOCE("Doce"),
    SALGADO("Salgado")
    ;
    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
