package br.senac.tads.dsw.crudclienteprodutobackend.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import lombok.NoArgsConstructor;


import java.util.UUID;

@Entity //indicar que é uma entidade
@Data //gera os getter e setter to string hashcode equals TUDO!!!
@Table(name = "clientes")
@NoArgsConstructor      // CONTSTRUTOR VAZIO pro jpa

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
                            //1 - nome , 2 email , 3 telefone , 4 endereco

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String telefone;

}
