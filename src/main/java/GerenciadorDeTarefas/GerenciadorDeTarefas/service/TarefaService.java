package GerenciadorDeTarefas.GerenciadorDeTarefas.service;

import GerenciadorDeTarefas.GerenciadorDeTarefas.model.Tarefa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import GerenciadorDeTarefas.GerenciadorDeTarefas.repository.TarefaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> listarTodas() {
        return repository.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}