package br.com.dio.desafio.dominio;

import java.time.LocalDate; // para trabalhar com datas

public class Mentoria extends Conteudo { // Mentoria tem tudo que Conteudo tem, mas Conteudo n tem tudo que Mentoria tem
    private LocalDate data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
