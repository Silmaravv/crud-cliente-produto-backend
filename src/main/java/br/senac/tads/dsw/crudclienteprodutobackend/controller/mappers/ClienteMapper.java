package br.senac.tads.dsw.crudclienteprodutobackend.controller.mappers;

import br.senac.tads.dsw.crudclienteprodutobackend.controller.dto.ClienteDTO;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    Cliente toEntity(ClienteDTO dto);
}
