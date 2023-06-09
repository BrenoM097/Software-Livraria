package com.br.project.library.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Table(name="Livros")
@Data
public class Livro {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int codigo;

     @NotBlank(message = "Título não informado.")
     private String titulo;
     @NotBlank(message = "Autor não informado.")
     private String autor;
     private int quantidadePaginas;
     private Double valor;
     @NotBlank(message = "Linguagem não informada.")
     private String linguagem;
     private String nomeTradutor;
     private String editora;
     private String dataLancamento;
}
