package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private Biblioteca biblioteca;

    public Menu() {
        this.biblioteca = new Biblioteca();
    }

    /*
    public void agregarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.nextLine();

        System.out.println("Ingrese la clasificación del libro:");
        String clasificacion = scanner.nextLine();

        System.out.println("Ingrese la cantidad de libros:");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Libro libro = new Libro(titulo, autor, clasificacion, cantidad);
        biblioteca.agregarLibro(libro);
        System.out.println("Libro agregado con éxito a la biblioteca.");
    }*/

  /* Clasificaciones
        System.out.println("Clasificaciones:");
        System.out.println("1. Programación");
        System.out.println("2. Ficción");
        System.out.println("3. Fantasía");
        System.out.println("4. Ciencia ficción");
        System.out.println("5. Misterio");*/

    public List<String> obtenerLibrosPorClasificacion(String clasificacion) {
        List<Libro> librosPorClasificacion = biblioteca.buscarPorClasificacion(clasificacion);
        List<String> titulosLibros = new ArrayList<>();

        if (!librosPorClasificacion.isEmpty()) {
            for (Libro libro : librosPorClasificacion) {
                String tituloLibro = libro.getTitulo();
                titulosLibros.add(tituloLibro);
            }
        }

        return titulosLibros;
    }


    public List<String> obtenerTodosLosAutores() {
        List<String> autores = biblioteca.obtenerAutoresUnicos();
        return autores;
    }

    public List<String> obtenerTodosLosTitulos() {
        List<Libro> todosLosLibros = biblioteca.obtenerTodosLosLibros();
        List<String> titulos = new ArrayList<>();

        for (Libro libro : todosLosLibros) {
            titulos.add(libro.getTitulo());
        }

        return titulos;
    }


}