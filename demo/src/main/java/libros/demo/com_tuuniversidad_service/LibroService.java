package libros.demo.com_tuuniversidad_service;

import java.util.List;

import libros.demo.com_tuuniversidad_models.Libro;
import libros.demo.com_tuuniversidad_repository.LibroRepository;

public interface LibroService {
    Libro getLibro (int id);
    List<Libro> getLibros();
    void postLibro(Libro libro);
}
