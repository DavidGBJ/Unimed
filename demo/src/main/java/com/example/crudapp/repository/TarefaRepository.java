package com.example.crudapp.repository;

import com.example.crudapp.model.tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.sprigframework.stereotypr.Repository;

@Repository
public interface TarefaRepository extends Jparepository<Tarefa, Long>{

}