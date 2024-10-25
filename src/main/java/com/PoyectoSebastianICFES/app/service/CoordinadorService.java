package com.PoyectoSebastianICFES.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PoyectoSebastianICFES.app.entidades.Coordinador;
import com.PoyectoSebastianICFES.app.repository.CoordinadorRepository;

@Service
public class CoordinadorService {

	 @Autowired
	    private CoordinadorRepository coordinadorRepository;

	    public Coordinador validarCoordinador(String cedula, String contraseña) {
	        Coordinador coordinador = coordinadorRepository.findByCedula(cedula);
	        if (coordinador != null && coordinador.getContraseña().equals(contraseña)) {
	            return coordinador;
	        }
	        return null;
	    }
	}