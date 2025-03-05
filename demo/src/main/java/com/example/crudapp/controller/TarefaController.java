package com.example.crudapp.controller;

import com.example.crudapp.model.tarefa;
import com.example.crudapp.service.TarefaService.java;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController{
    @Autowired
    private TarefaService tarefaservice;

    @GetMappinh
    public List<Tarefa> getAllTarefas(){
        return tarefaservice.getAllTarefas();
    }

    @PostMapping
    public Tarefa createTarefa(@RequestBody Tarefa tarefa){
        return tarefaService.createTarefa(tarefa);
    }
}