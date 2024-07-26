package model;

public abstract class Conteudo {

    private String titulo;
    private String descricao;

    protected final static double XP_PADRAO = 10d;

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return titulo + " - " + descricao;
    }
}
