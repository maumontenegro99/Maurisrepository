package com.example.bibliotecaduoc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;

@Service

public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libroRepository.guardar(libro);            
    }

    public Libro getLibroId(int id) {
        return libroRepository.buscarPorId(id);
    }
    
    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }

    public Libro getLibroAño(int fechaPublicacion){
        return libroRepository.buscarPorAño(fechaPublicacion);
    }

    public Libro getLibroAutor(String autor){
        return libroRepository.buscarPorAutor(autor);
    }

    public Libro updateLibro(Libro libro) {
        return libroRepository.actualizar(libro);
    }
    public String borrarLibro(int id) {
        libroRepository.deleteLibro(id);
        return "producto eliminado";
    }
    public int totalLibrosV1(){
        return libroRepository.obtenerLibros().size();
    }
    public Libro getLibroMasAntiguo() {
        return libroRepository.buscarLibroMasAntiguo();
    }
    
    public Libro getLibroMasNuevo() {
        return libroRepository.buscarLibroMasNuevo();
    }
    
    public List<Libro> getLibrosOrdenadosPorFecha() {
        return libroRepository.obtenerLibrosOrdenadosPorFecha();
    }

}
