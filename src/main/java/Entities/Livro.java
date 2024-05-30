package Entities;

import java.util.Set;

public class Livro {

    private Long id;
    private String titulo;
    private Integer ano_publicacao;
    private Integer numero_paginas;
    private Double preco;
    private String img_livro;

    private Autor autor;

    private Editora editora;

    private Set<Categoria> categorias;

}
