package br.senac.tads.dsw.crudclienteprodutobackend.controller;

import br.senac.tads.dsw.crudclienteprodutobackend.controller.dto.ProdutoDTO;
import br.senac.tads.dsw.crudclienteprodutobackend.controller.mappers.ProdutoMapper;
import br.senac.tads.dsw.crudclienteprodutobackend.model.Produto;
import br.senac.tads.dsw.crudclienteprodutobackend.services.ProdutoService;
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
@RequestMapping("produtos")
@RequiredArgsConstructor
public class ProdutoController {

    @NonNull
    private ProdutoService service;

    @NonNull
    ProdutoMapper mapper;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody @Valid ProdutoDTO produtoDTO) {
        Produto produto = mapper.toEntity(produtoDTO);
        service.save(produto);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(produto.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }

    @GetMapping
    public ResponseEntity<List<Produto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@RequestBody @Valid ProdutoDTO produtoDTO, @PathVariable String id) {

        UUID idProduto = UUID.fromString(id);

        Optional<Produto> produtoOptional = service.findById(idProduto);

        if (produtoOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        Produto produto = mapper.toEntity(produtoDTO);
        produto.setId(idProduto);

        service.update(produto);

        return ResponseEntity.noContent().build();
    }


    @GetMapping("{id}")
    public ResponseEntity<Produto> findById(@PathVariable String id) {
        UUID idProduto = UUID.fromString(id);
        Optional<Produto> produtoEncontrado = service.findById(idProduto);
        if (produtoEncontrado.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produtoEncontrado.get());
    }


    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        UUID idProduto = UUID.fromString(id);
        Optional<Produto> produto = service.findById(idProduto);

        if (produto.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.delete(produto.get());

        return ResponseEntity.noContent().build();
    }


}
