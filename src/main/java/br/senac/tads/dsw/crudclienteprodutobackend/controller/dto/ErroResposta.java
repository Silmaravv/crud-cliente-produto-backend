package br.senac.tads.dsw.crudclienteprodutobackend.controller.dto;

import java.util.List;

public record ErroResposta(int status, String mensagem, List<ErroCampo> erros) {
}
