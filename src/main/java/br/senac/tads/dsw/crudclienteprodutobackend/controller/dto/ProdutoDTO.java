package br.senac.tads.dsw.crudclienteprodutobackend.controller.dto;

import java.util.UUID;

public record ProdutoDTO(UUID nome, String descricao, double preco, int quantidade) {
}
