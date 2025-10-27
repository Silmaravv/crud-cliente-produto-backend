package br.senac.tads.dsw.crudclienteprodutobackend.controller.dto;

import ch.qos.logback.core.boolex.EvaluationException;
import jakarta.validation.constraints.*;
import lombok.Value;
import org.hibernate.validator.constraints.UUID;

import java.math.BigDecimal;

public record ProdutoDTO(


        UUID ID,
        @NotBlank(message = "Campo obrigatório!")
        String nome,

        @NotBlank(message = "Campo obrigatório!")
        @Size(min = 6, max = 320, message = "Campo fora do tamanho padrão!")
        String descricao,
        @DecimalMin(value = "0.01",
                message = "O preco minimo deve ser no minimo 0,50R$")
        BigDecimal preco,

        @Min(value = 1, message = "A quantidade dever ser no minimo 1")
        int quantidade
) {
}
