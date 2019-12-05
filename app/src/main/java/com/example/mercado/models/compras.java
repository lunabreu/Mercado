package com.example.mercado.models;

public class compras {
    private String name;
    private int imagem;

    public compras() {
    }

    public compras(String name, int imagem) {
        this.name = name;
        this.imagem = imagem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
