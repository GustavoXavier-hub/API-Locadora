package com.FastMoving.api_locadora.controller;

import com.FastMoving.api_locadora.dao.CartaoDAO;
import com.FastMoving.api_locadora.model.Cartao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cartao")
@CrossOrigin(origins = "*")
public class CartaoController {


    @Autowired
    private CartaoDAO dao;

    @GetMapping
    public ResponseEntity<List<Cartao>> listar() {
        List<Cartao> cartoes = dao.findAll();
        return ResponseEntity.ok(cartoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cartao> buscar(@PathVariable Integer id) {
        Optional<Cartao> resultado = dao.findById(id);
        return resultado.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cartao> inserir(@Valid @RequestBody Cartao cartao) {
        Cartao cartaoSalvo = dao.save(cartao);
        return ResponseEntity.ok(cartaoSalvo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        Optional<Cartao> resultado = dao.findById(id);
        if (resultado.isPresent()) {
            dao.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cartao> atualizar(@PathVariable Integer id, @Valid @RequestBody Cartao cartao) {
        Optional<Cartao> resultado = dao.findById(id);
        if (resultado.isPresent()) {
            Cartao cartaoExistente = resultado.get();
            cartaoExistente.setNome(cartao.getNome()); // Exemplo de como atualizar os campos
            cartaoExistente.setDataVencimento(cartao.getDataVencimento());
            cartaoExistente.setCodigo(cartao.getCodigo());
            cartaoExistente.setNumero(cartao.getNumero());

            Cartao cartaoAtualizado = dao.save(cartaoExistente);
            return ResponseEntity.ok(cartaoAtualizado);
        }
        return ResponseEntity.notFound().build();
    }

}
