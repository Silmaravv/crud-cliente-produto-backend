package br.senac.tads.dsw.crudclienteprodutobackend.services;


import br.senac.tads.dsw.crudclienteprodutobackend.model.Produto;
import br.senac.tads.dsw.crudclienteprodutobackend.repository.ProdutoRepository;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProdutoService {

    @NonNull
    private ProdutoRepository repository;

    public void save(Produto produto) {
        repository.save(produto);
    }

    public void update(Produto produto) {
        repository.save(produto);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Optional<Produto> findById(UUID id) {
        return repository.findById(id);
    }

    public void delete(Produto produto) {
        repository.delete(produto);
    }
}
