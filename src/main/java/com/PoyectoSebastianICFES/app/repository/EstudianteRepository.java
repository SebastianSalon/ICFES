package com.PoyectoSebastianICFES.app.repository;

import com.PoyectoSebastianICFES.app.entidades.Estudiantes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends MongoRepository<Estudiantes, String> {
	 Estudiantes findByCorreoElectronicoAndNumeroDocumento(String correoElectronico, String numeroDocumento);
}
