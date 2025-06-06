package GerenciadorDeTarefas.GerenciadorDeTarefas.repository;

import GerenciadorDeTarefas.GerenciadorDeTarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}