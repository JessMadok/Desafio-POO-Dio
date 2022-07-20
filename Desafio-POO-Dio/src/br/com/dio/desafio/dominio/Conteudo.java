package br.com.dio.desafio.dominio;

public abstract class Conteudo {
   protected static final double XP_PADRAO = 100;

   private String titulo;
   private String descricao;

   public abstract double calcularXp();


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
