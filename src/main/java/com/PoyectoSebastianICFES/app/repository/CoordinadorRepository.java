package com.PoyectoSebastianICFES.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.PoyectoSebastianICFES.app.entidades.Coordinador;

@Repository
public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {
   
    Coordinador findByCedula(String cedula);
}