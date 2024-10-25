package com.PoyectoSebastianICFES.app.service;

import com.PoyectoSebastianICFES.app.entidades.Estudiantes;
import com.PoyectoSebastianICFES.app.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudiantesService {

	 
	@Autowired
    private EstudianteRepository estudianteRepository;

	   public Estudiantes findByCorreoAndNumeroDocumento(String correo, String numeroDocumento) {
	        Estudiantes estudiante = estudianteRepository.findByCorreoElectronicoAndNumeroDocumento(correo, numeroDocumento);
	        
	        return estudiante;
	    }
	   
	    public Estudiantes findById(String id) {
	        return estudianteRepository.findById(id).orElse(null);
	    }
	
    public List<Estudiantes> obtenerTodosEstudiantes() { 
        return estudianteRepository.findAll();
    }

    public void guardarEstudiante(Estudiantes estudiante) { 
        estudianteRepository.save(estudiante);
    }

    public void eliminarEstudiante(String id) { 
        estudianteRepository.deleteById(id);
    }

    public Estudiantes obtenerEstudiantePorId(String id) { 
        return estudianteRepository.findById(id).orElse(null);
    }
}