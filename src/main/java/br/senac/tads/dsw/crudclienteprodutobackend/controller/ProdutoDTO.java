package br.senac.tads.dsw.crudclienteprodutobackend.controller;

import java.util.UUID;

public record ProdutoDTO(UUID nome, String descricao, double preco, int quantidade) {
}
