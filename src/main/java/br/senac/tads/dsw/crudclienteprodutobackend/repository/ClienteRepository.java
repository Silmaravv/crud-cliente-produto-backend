package br.senac.tads.dsw.crudclienteprodutobackend.repository;

import br.senac.tads.dsw.crudclienteprodutobackend.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
