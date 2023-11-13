package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Biblioteca {
    private List<Libro> inventario;

    public Biblioteca() {
        this.inventario = new ArrayList<>();
        // Inicializar con libros manualmente
        inventario.add(new Libro("Código Limpio", "Robert C. Martin", "Programación", 2));
        inventario.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Ficción", 5));
        inventario.add(new Libro("Código Limpio", "Robert C. Martin", "Programación", 2));
        inventario.add(new Libro("Cien Años de Soledad", "Gabriel García Márquez", "Ficción", 5));
        inventario.add(new Libro("El Guardián entre el Centeno", "J.D. Salinger", "Ficción", 3));
        inventario.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Ficción", 4));
        inventario.add(new Libro("Matar a un Ruiseñor", "Harper Lee", "Ficción", 2));
        inventario.add(new Libro("1984", "George Orwell", "Ficción", 6));
        inventario.add(new Libro("El Hobbit", "J.R.R. Tolkien", "Fantasía", 3));
        inventario.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "Fantasía", 4));
        inventario.add(new Libro("Un Mundo Feliz", "Aldous Huxley", "Ciencia ficción", 7));
        inventario.add(new Libro("Fundación", "Isaac Asimov", "Ciencia ficción", 2));
        inventario.add(new Libro("El Marciano", "Andy Weir", "Ciencia ficción", 8));
        inventario.add(new Libro("El Código Da Vinci", "Dan Brown", "Misterio", 5));
        inventario.add(new Libro("Millennium 1: Los Hombres que no Amaban a las Mujeres", "Stieg Larsson", "Misterio", 3));
        inventario.add(new Libro("Perdida", "Gillian Flynn", "Misterio", 6));
        inventario.add(new Libro("El Paciente Silencioso", "Alex Michaelides", "Misterio", 4));
        inventario.add(new Libro("El Guardián entre el Centeno", "J.D. Salinger", "Ficción", 14));
        inventario.add(new Libro("El Gran Gatsby", "F. Scott Fitzgerald", "Ficción", 5));
        inventario.add(new Libro("Matar a un Ruiseñor", "Harper Lee", "Ficción", 7));
        inventario.add(new Libro("1984", "George Orwell", "Distópico", 10));
        inventario.add(new Libro("Un Mundo Feliz", "Aldous Huxley", "Distópico", 8));
        inventario.add(new Libro("El Resplandor", "Stephen King", "Terror", 3));
        inventario.add(new Libro("La Chica del Tren", "Paula Hawkins", "Misterio", 11));
        inventario.add(new Libro("El Marciano", "Andy Weir", "Ciencia Ficción", 13));
        inventario.add(new Libro("Los Juegos del Hambre", "Suzanne Collins", "Distópico", 19));
        inventario.add(new Libro("Perdida", "Gillian Flynn", "Misterio", 16));
        inventario.add(new Libro("El Camino", "Cormac McCarthy", "Post-apocalíptico", 6));
        inventario.add(new Libro("Cometas en el Cielo", "Khaled Hosseini", "Ficción Histórica", 9));
        inventario.add(new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", "Fantasía", 4));
        inventario.add(new Libro("El Paciente Silencioso", "Alex Michaelides", "Thriller", 15));
        inventario.add(new Libro("El Alquimista", "Paulo Coelho", "Ficción", 17));
        inventario.add(new Libro("Orgullo y Prejuicio", "Jane Austen", "Romance", 20));
        inventario.add(new Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "Realismo Mágico", 12));
        inventario.add(new Libro("El Código Da Vinci", "Dan Brown", "Misterio", 2));
        inventario.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "Fantasía", 18));
        inventario.add(new Libro("El Padrino", "Mario Puzo", "Crimen", 1));
        inventario.add(new Libro("Bajo el Mismo Cielo", "John Green", "Juvenil", 15));
        inventario.add(new Libro("Las Crónicas de Narnia", "C.S. Lewis", "Fantasía", 12));
                // Libros a añadir manualmente.......
    }

    String[] Clasificaciones = {
            "Programación", "Ficción", "Programación", "Ficción",
            "Ficción", "Ficción", "Ficción", "Ficción",
            "Fantasía", "Fantasía", "Ciencia ficción", "Ciencia ficción",
            "Ciencia ficción", "Misterio", "Misterio", "Misterio", "Misterio"
    };

    public void agregarLibro(Libro libro) {

        inventario.add(libro);
    }

    public List<Libro> buscarPorClasificacion(String clasificacion) {
        return inventario.stream()
                .filter(libro -> libro.getClasificacion().equalsIgnoreCase(clasificacion))
                .collect(Collectors.toList());
    }

    /* public List<Libro> buscarPorAutor(String autor) {
        return inventario.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .collect(Collectors.toList());
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        return inventario.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }*/

    public List<String> obtenerAutoresUnicos() {
        Set<String> autoresSet = new HashSet<>();

        for (Libro libro : inventario) {
            autoresSet.add(libro.getAutor());
        }

        return new ArrayList<>(autoresSet);
    }

    public List<Libro> obtenerTodosLosLibros() {

        return new ArrayList<>(inventario);
    }

    public String obtenerAutorPorTitulo(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equals(titulo)) {
                return libro.getAutor();
            }
        }
        return titulo;
    }

    public String obtenerClasificacionPorTitulo(String titulo) {
        for (Libro libro : inventario) {
            if (libro.getTitulo().equals(titulo)) {
                return libro.getClasificacion();
            }
        }
        return titulo;
    }

    public int obtenerCantidadDeLibrosPorTitulo(String titulo) {
        String tituloLowerCase = titulo.toLowerCase();
        return inventario.stream()
                .filter(libro -> libro.getTitulo().toLowerCase().equals(tituloLowerCase))
                .mapToInt(Libro::getNlibros)
                .sum();
    }

    public List<String> obtenerTitulosPorAutor(String autor) {
        return inventario.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .map(Libro::getTitulo)
                .distinct()
                .collect(Collectors.toList());
    }

    public int obtenerCantidadTotalLibrosPorAutor(String autor) {
        return inventario.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .mapToInt(Libro::getNlibros)
                .sum();
    }

    public List<String> obtenerClasificacionesPorAutor(String autor) {
        return inventario.stream()
                .filter(libro -> libro.getAutor().equalsIgnoreCase(autor))
                .map(Libro::getClasificacion)
                .distinct()
                .collect(Collectors.toList());
    }

    public Set<String> obtenerAutoresUnicosPorClasificacion(String clasificacion) {
        List<Libro> librosPorClasificacion = buscarPorClasificacion(clasificacion);
        Set<String> autores = new HashSet<>();

        for (Libro libro : librosPorClasificacion) {
            autores.add(libro.getAutor());
        }

        return autores;
    }

    public Set<String> obtenerTitulosUnicosPorClasificacion(String clasificacion) {
        List<Libro> librosPorClasificacion = buscarPorClasificacion(clasificacion);
        Set<String> titulos = new HashSet<>();

        for (Libro libro : librosPorClasificacion) {
            titulos.add(libro.getTitulo());
        }

        return titulos;
    }

    public int obtenerCantidadTotalLibrosPorClasificacion(String clasificacion) {
        return inventario.stream()
                .filter(libro -> libro.getClasificacion().equalsIgnoreCase(clasificacion))
                .mapToInt(Libro::getNlibros)
                .sum();
    }

    public Set<String> obtenerTodasLasClasificaciones(String currentBook) {
        Set<String> clasificacionesUnicas = new HashSet<>();

        for (Libro libro : inventario) {
            clasificacionesUnicas.add(libro.getClasificacion());
        }

        return clasificacionesUnicas;
    }


}