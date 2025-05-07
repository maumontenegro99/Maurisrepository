package com.example.bibliotecaduoc.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Libro;

@Repository

public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();



    public List<Libro> obtenerLibros() {
        return listaLibros;
    }
    public Libro buscarPorId(int id){
        for (Libro libro : listaLibros){
            if (libro.getId()== id){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorAño(int fechaPublicacion) {
        for (Libro libro : listaLibros) {
            if (libro.getFechaPublicacion()==fechaPublicacion){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorAutor(String autor) {
        for (Libro libro : listaLibros) {
            if (libro.getAutor().equals(autor)){
                return libro;
            }
        }
        return null;
    } 

    // faltan 3 metodos

    public Libro guardar(Libro lib) {
        listaLibros.add(lib);
        return lib;
    }

    public Libro actualizar(Libro lib) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == lib.getId()) {
                id = lib.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setEditorial(lib.getEditorial());
        libro1.setIsbn(lib.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;

    }

    public void eliminar(int id) {
        //primer metodo

        Libro libro =buscarPorId(id);
        if (libro != null) {
            listaLibros.remove(libro);
        }

        //segundo metodo

        int idPosicion = 0;
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getId() == id) {
                idPosicion = i;
                break;
            }
        }

        if (idPosicion > 0) {
            listaLibros.remove(idPosicion);
        }

        //tercer metodo

        listaLibros.removeIf(x -> x.getId() == id);
    }

    public int totalLibros(){
        return listaLibros.size();
    }
    public Libro buscarLibroMasAntiguo() {
        if (listaLibros.isEmpty()) return null;
    
        Libro masAntiguo = listaLibros.get(0);
        for (Libro libro : listaLibros) {
            if (libro.getFechaPublicacion() < masAntiguo.getFechaPublicacion()) {
                masAntiguo = libro;
            }
        }
        return masAntiguo;
    }
    public Libro buscarLibroMasNuevo() {
        if (listaLibros.isEmpty()) return null;
    
        Libro masNuevo = listaLibros.get(0);
        for (Libro libro : listaLibros) {
            if (libro.getFechaPublicacion() > masNuevo.getFechaPublicacion()) {
                masNuevo = libro;
            }
        }
        return masNuevo;
    }
    public List<Libro> obtenerLibrosOrdenadosPorFecha() {
        List<Libro> copia = new ArrayList<>(listaLibros);
        copia.sort((a, b) -> Integer.compare(a.getFechaPublicacion(), b.getFechaPublicacion()));
        return copia;
    }
}
