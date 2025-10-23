package br.senac.tads.dsw.crudclienteprodutobackend.services;

import br.senac.tads.dsw.crudclienteprodutobackend.model.Cliente;
import br.senac.tads.dsw.crudclienteprodutobackend.repository.ClienteRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClienteService {

    @NonNull
    private ClienteRepository repository;

    public void save(Cliente cliente) {
        repository.save(cliente);
    }

    public void update(Cliente cliente) {
        repository.save(cliente);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Optional<Cliente> findById(UUID id) {
        return repository.findById(id);
    }

    public void delete(Cliente cliente) {
        repository.delete(cliente);
    }
}
