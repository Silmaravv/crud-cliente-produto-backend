package br.senac.tads.dsw.crudclienteprodutobackend.controller.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record ClienteDTO(
        UUID id,
        @NotBlank(message = "Campo obrigatório!")
        @Size(min = 2, max = 50, message = "Campo fora do tamanho padrão!")
        String nome,
        @Email
        @NotBlank(message = "Campo obrigatório!")
        @Size(min = 6, max = 320, message = "Campo fora do tamanho padrão!")
        String email,
        @NotBlank(message = "Campo obrigatório!")
        @Size(min = 12, max = 15, message = "Campo fora do tamanho padrão!")
        String telefone,
        @NotBlank(message = "Campo obrigatório!")
        @Size(min = 5, max = 100, message = "Campo fora do tamanho padrão!")
        String endereco
) {
}
