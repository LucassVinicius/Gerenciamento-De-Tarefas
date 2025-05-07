package GerenciadorDeTarefas.GerenciadorDeTarefas.controller;

import GerenciadorDeTarefas.GerenciadorDeTarefas.model.Tarefa;
import GerenciadorDeTarefas.GerenciadorDeTarefas.repository.TarefaRepository;
import GerenciadorDeTarefas.GerenciadorDeTarefas.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return service.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa novaTarefa) {
        return service.buscarPorId(id)
                .map(tarefa -> {
                    tarefa.setTitulo(novaTarefa.getTitulo());
                    tarefa.setDescricao(novaTarefa.getDescricao());
                    tarefa.setConcluida(novaTarefa.isConcluida());
                    return ResponseEntity.ok(service.salvar(tarefa));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.buscarPorId(id).isPresent()) {
            service.deletar(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping("/tarefas")
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }
}