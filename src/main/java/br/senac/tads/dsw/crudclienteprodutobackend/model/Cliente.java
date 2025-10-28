package br.senac.tads.dsw.crudclienteprodutobackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity //indicar que é uma entidade
@Data //gera os getter e setter to string hashcode equals TUDO!!!
@Table(name = "clientes")
@NoArgsConstructor      // CONTSTRUTOR VAZIO pro jpa
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;

    private LocalDateTime dataAtualizacao = LocalDateTime.now();
}
