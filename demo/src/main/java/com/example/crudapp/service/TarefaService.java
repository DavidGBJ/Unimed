package com.example.crudapp.service;
import com.example.crudapp.model.tarefa;
import com.example.crudapp.repository.TarefaRepository;
import org.Springframework.beans.factory.annotation.Autowired;
import org.springframework.stereortype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService{

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas(){
        return tarefaRepository.findAll();
    }

    public Tarefa createTarefa(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }
}
