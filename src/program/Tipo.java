package program;

public enum Tipo {
    COPOS("Copos"),
    PRATOS("Pratos"),
    XICARAS("Xicaras"),
    PORCOES("Porções"),
    UNIDADES("Unidades"),
    COLHERES("Colheres"),
    MILILITROS("Mililitros"),
    MILIGRAMAS("Miligramas")
    ;

  private String tipo;

    Tipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
