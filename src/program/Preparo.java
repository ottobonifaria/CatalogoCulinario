package program;

public class Preparo {
    private String descricao;

    public Preparo(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "\n\t" + descricao;
    }

    public void alteraDescricao(String descricao) {
        setDescricao(descricao);
    }
}
