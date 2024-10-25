package com.PoyectoSebastianICFES.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.PoyectoSebastianICFES.app.entidades.Coordinador;
import com.PoyectoSebastianICFES.app.entidades.Estudiantes;
import com.PoyectoSebastianICFES.app.service.CoordinadorService;
import com.PoyectoSebastianICFES.app.service.EstudiantesService;

import java.util.List;

@Controller
public class CoordinadorWebController {

    @Autowired
    private EstudiantesService estudiantesService;

    @Autowired
    private CoordinadorService coordinadorService;

    
    @GetMapping("/coordinadorLogin")
    public String mostrarLoginCoordinador() {
        return "coordinadorLogin"; 
    }

   
    @PostMapping("/loginCoordinador")
    public String loginCoordinador(@RequestParam("cedula") String cedula,
                                   @RequestParam("contraseña") String contraseña,
                                   Model model) {
        Coordinador coordinador = coordinadorService.validarCoordinador(cedula, contraseña);

        if (coordinador != null) {
            
        	
            return "redirect:/verCoordinador";
        } else {
            
        	
            model.addAttribute("error", "Cédula o contraseña incorrecta");
            return "coordinadorLogin";
        }
    }

    
    @GetMapping("/verCoordinador")
    public String verCoordinador(Model model) {
        List<Estudiantes> estudiantes = estudiantesService.obtenerTodosEstudiantes();
        model.addAttribute("estudiantes", estudiantes);
        return "VerCoordinador"; 
    }

    
    @GetMapping("/agregarEstudiante")
    public String mostrarFormularioAgregarEstudiante(Model model) {
        model.addAttribute("estudiante", new Estudiantes());
        return "formCoordinador"; 
    }

  
    @PostMapping("/guardarEstudiante")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiantes estudiante) {
        estudiantesService.guardarEstudiante(estudiante);
        return "redirect:/verCoordinador"; 
    }

    
    @GetMapping("/editarEstudiante/{id}")
    public String editarEstudiante(@PathVariable String id, Model model) {
        Estudiantes estudiante = estudiantesService.obtenerEstudiantePorId(id);
        model.addAttribute("estudiante", estudiante);
        model.addAttribute("accion", "Editar Estudiante");
        return "formCoordinador"; 
    }

    
    @GetMapping("/eliminarEstudiante/{id}")
    public String eliminarEstudiante(@PathVariable String id) {
        estudiantesService.eliminarEstudiante(id);
        return "redirect:/verCoordinador";
    }
    
    @GetMapping("/verEstudiante/{id}")
    public String verEstudiante(@PathVariable("id") String id, Model model) {
        Estudiantes estudiante = estudiantesService.findById(id);

        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "VerEstudiantes"; 
        } else {
            model.addAttribute("error", "No se encontró el estudiante.");
            return "redirect:/coordinador";  
        }
    }
    
}