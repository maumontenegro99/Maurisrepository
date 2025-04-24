package com.alumnos.duoc.alumnos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class AlumnosController {

    @GetMapping("api/v1/alumnos")
    public String getAlumnos() {
        return "LISTADO DE ALUMNOS";
    }

    @GetMapping("api/v1/alumnos/{id}")
      public String getAlumnos(@PathVariable("id") int id) {
        return "DETALLE ALUMNO " + id;
    
    

}
}
