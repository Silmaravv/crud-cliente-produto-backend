package br.senac.tads.dsw.crudclienteprodutobackend.controller;

import br.senac.tads.dsw.crudclienteprodutobackend.controller.dto.ClienteDTO;
import br.senac.tads.dsw.crudclienteprodutobackend.controller.mappers.ClienteMapper;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Cliente;
import br.senac.tads.dsw.crudclienteprodutobackend.services.ClienteService;
import jakarta.validation.Valid;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    @NonNull
    private ClienteService service;

    @NonNull
    private ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Valid ClienteDTO clienteDTO) {
        Cliente cliente = mapper.toEntity(clienteDTO);
        service.save(cliente);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(cliente.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(
            @RequestBody @Valid ClienteDTO clienteDTO, @PathVariable String id
    ) {
        UUID idCliente = UUID.fromString(id);
        Optional<Cliente> clienteOptional = service.findById(idCliente);

        if(clienteOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Cliente cliente = mapper.toEntity(clienteDTO);
        cliente.setId(idCliente);

        service.update(cliente);

        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente> findById(@PathVariable String id) {
        UUID idCliente = UUID.fromString(id);

        Optional<Cliente> clienteEncontrado = service.findById(idCliente);

        if(clienteEncontrado.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(clienteEncontrado.get());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        UUID idCliente = UUID.fromString(id);

        Optional<Cliente> cliente = service.findById(idCliente);

        if(cliente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        service.delete(cliente.get());

        return ResponseEntity.noContent().build();
    }
}
