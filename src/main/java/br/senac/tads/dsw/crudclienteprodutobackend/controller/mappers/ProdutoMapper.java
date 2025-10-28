package br.senac.tads.dsw.crudclienteprodutobackend.controller.mappers;

import br.senac.tads.dsw.crudclienteprodutobackend.controller.dto.ProdutoDTO;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Produto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    Produto toEntity(ProdutoDTO dto);
}
