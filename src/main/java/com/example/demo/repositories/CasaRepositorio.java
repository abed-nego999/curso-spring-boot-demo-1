package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Casa;

@Repository
public interface CasaRepositorio extends CrudRepository<Casa, Integer> {

}
