package br.senac.tads.dsw.crudclienteprodutobackend.controller.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.util.UUID;

public record ProdutoDTO(
        UUID id,
        @NotBlank(message = "Campo obrigatório!")
        String nome,
        @Size(max = 320, message = "Campo fora do tamanho padrão!")
        String descricao,
        @DecimalMin(value = "0.5",
                message = "O preco deve ser no minimo R$ 0,50")
        BigDecimal preco,
        @Min(value = 1, message = "A quantidade dever ser no minimo 1")
        Integer quantidade
) {
}
