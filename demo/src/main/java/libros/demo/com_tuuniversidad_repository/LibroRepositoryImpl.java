package libros.demo.com_tuuniversidad_repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import libros.demo.com_tuuniversidad_models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository{
    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryImpl() {
        libros.add(new Libro(1L, "A History", "Jonathan Clements", "British Film Institute", 2013));
        libros.add(new Libro(2L, "The Anime Machine", "Thomas Lamarre", "University of Minnesota Press", 2009));
        libros.add(new Libro(3L, "Anime Explosion!", "Patrick Drazen", "Stone Bridge Press", 2002));
        libros.add(new Libro(4L, "Beautiful Fighting Girl", "Saitō Tamaki", "University of Minnesota Press", 2011));
    }

    public Libro getLibro (int id){
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;
        }

        return null;
        
    }

    public List<Libro> getLibros() {
        return libros;
    }


    public void postLibro(Libro libro) {
        libros.add(libro);
    }

}
