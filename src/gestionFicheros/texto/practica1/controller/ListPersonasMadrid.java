package gestionFicheros.texto.practica1.controller;

import java.util.*;

import gestionFicheros.texto.practica1.model.Persona;

public class ListPersonasMadrid {

  private List<Persona> lista = new ArrayList<>();

  public ListPersonasMadrid() {
    // Constructor vacio
  }

  public List<Persona> rellenaListaPersonas() {
    lista.add(new Persona("Tamara de los Angeles", "Molina", 28, 170, 60));
    lista.add(new Persona("Bea", "Enamorado", 28, 170, 60));
    lista.add(new Persona("Esteban", "Lopez", 28, 170, 60));
    lista.add(new Persona("David", "Moya", 33, 167, 63));
    lista.add(new Persona("Raul", "Del Pozo", 32, 175, 68));
    return lista;
  }
}