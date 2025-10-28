package br.senac.tads.dsw.crudclienteprodutobackend.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data //gera os getter e setter to string hashcode equals TUDO!!!
@Table(name = "produtos") // TABELA ONDE O OBJETO VAI SER DIRECIONADO
@NoArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String descricao;
    private BigDecimal preco;     //1 - nome , 2 - descricação, 3 - preco, 4 - estoque
    private Integer quantidade;

    private LocalDateTime dataAtualizacao = LocalDateTime.now();
}
