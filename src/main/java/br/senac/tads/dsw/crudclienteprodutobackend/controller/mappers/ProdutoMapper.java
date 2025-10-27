package br.senac.tads.dsw.crudclienteprodutobackend.controller.mappers;

import br.senac.tads.dsw.crudclienteprodutobackend.controller.dto.ProdutoDTO;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Cliente;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Produto;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto toEntity(@Valid ProdutoDTO dto);
}
