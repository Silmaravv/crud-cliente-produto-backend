package br.senac.tads.dsw.crudclienteprodutobackend.repository;

import br.senac.tads.dsw.crudclienteprodutobackend.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, UUID> {
}
