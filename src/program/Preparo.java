package program;

public class Preparo {
    private String descricao;

    public Preparo(String descrição) {
        this.descricao = descrição;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "\n\t" + descricao.toString();
    }

    public void alteraDescricao(String descricao) {
        setDescricao(descricao);
    }
}
