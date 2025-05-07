package com.example.bibliotecaduoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.beans.factory.annotation.Autowired;




@RestController
@RequestMapping("/api/v1/libros")

public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping 
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("/{id}")
    public Libro buscarLibro(@PathVariable int id){
        return libroService.getLibroId(id);
    }
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        return libroService.updateLibro(libro);
    }
    @DeleteMapping("/{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }
    @GetMapping("/total")
    public int totalLibrosV2(){
        return libroService.totalLibrosV1();
    }
    @GetMapping("/isbn/{isbn}")
    public Libro buscarPorIsbn(@PathVariable String isbn){
        return libroService.getLibroIsbn(isbn);
    }
    @GetMapping("/año/{año}")
    public Libro buscarPorAño(@PathVariable int año){
        return libroService.getLibroAño(año);
    }
    @GetMapping("/autor/{autor}")
    public Libro buscarPorAutor(@PathVariable String autor){
        return libroService.getLibroAutor(autor);
    }
    @GetMapping("/antiguo")
    public Libro obtenerLibroMasAntiguo() {
        return libroService.getLibroMasAntiguo();
    }
    @GetMapping("/nuevo")
    public Libro obtenerLibroMasNuevo() {
        return libroService.getLibroMasNuevo();
    }
    @GetMapping("/ordenados")
    public List<Libro> listarLibrosOrdenadosPorFecha() {
        return libroService.getLibrosOrdenadosPorFecha();
    }
    
    
    
}
    


