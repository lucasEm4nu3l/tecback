package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.dto.ProdutorDTO;
import br.com.fujideia.iesp.tecback.service.ProdutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtores")
@RequiredArgsConstructor
public class ProdutorController {

    private final ProdutorService produtorService;

    @GetMapping
    public ResponseEntity<List<ProdutorDTO>> listarTodos() {
        List<ProdutorDTO> produtores = produtorService.listarTodos();
        return ResponseEntity.ok(produtores);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutorDTO> buscarPorId(@PathVariable Long id) {
        Optional<ProdutorDTO> produtorDTO = produtorService.buscarPorId(id);
        return produtorDTO.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProdutorDTO> criarProdutor(@RequestBody ProdutorDTO produtorDTO) {
        ProdutorDTO novoProdutor = produtorService.criarProdutor(produtorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProdutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutorDTO> atualizarProdutor(@PathVariable Long id, @RequestBody ProdutorDTO produtorDTO) {
        Optional<ProdutorDTO> produtorAtualizado = produtorService.atualizarProdutor(id, produtorDTO);
        return produtorAtualizado.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProdutor(@PathVariable Long id) {
        boolean deletado = produtorService.deletarProdutor(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
