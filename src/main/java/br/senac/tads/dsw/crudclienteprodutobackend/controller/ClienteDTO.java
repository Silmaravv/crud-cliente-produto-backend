package br.senac.tads.dsw.crudclienteprodutobackend.controller;

import java.util.UUID;

public record ClienteDTO(

        UUID id, String nome, String email, String telefone, String endereco

) {


}
