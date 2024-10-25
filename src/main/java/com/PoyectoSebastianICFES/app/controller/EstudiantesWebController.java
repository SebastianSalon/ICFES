package com.PoyectoSebastianICFES.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.PoyectoSebastianICFES.app.entidades.Estudiantes;
import com.PoyectoSebastianICFES.app.service.EstudiantesService;

import jakarta.servlet.http.HttpSession;

import org.springframework.ui.Model;

@Controller
public class EstudiantesWebController {

    @Autowired
    private EstudiantesService estudianteService;
    
    @GetMapping("/estudiantesLogin")
    public String mostrarLoginEstudiante() {
        return "estudiantesLogin";  
    }

    @PostMapping("/loginEstudiante")
    public String loginEstudiante(@RequestParam("correoElectronico") String correoElectronico, 
                                  @RequestParam("numeroDocumento") String numeroDocumento, 
                                  Model model,
                                  HttpSession session) {
        
        Estudiantes estudiante = estudianteService.findByCorreoAndNumeroDocumento(correoElectronico, numeroDocumento);
        
        if (estudiante != null) {
            session.setAttribute("estudiante", estudiante);
            model.addAttribute("estudiante", estudiante);
            return "VerEstudiantes";  
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos.");
            return "estudiantesLogin";  
        }
    }
    
    @GetMapping("/VerEstudianteNivel")
    public String verEstudiantesNivel(HttpSession session, Model model) {

        Estudiantes estudiante = (Estudiantes) session.getAttribute("estudiante");
        
        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "VerEstudianteNivel";
        } else {
            model.addAttribute("error", "No se encontró el estudiante.");
            return "VerEstudiantes";
        }
    }
    }
