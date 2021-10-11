package gestionFicheros.texto.practica1.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import gestionFicheros.texto.practica1.model.GestionPersonas;
import gestionFicheros.texto.practica1.model.Persona;
import gestionFicheros.texto.practica1.view.Console;

public class MainPersona {

  public static void main(String[] args) {

    ListPersonasMadrid lpm = new ListPersonasMadrid();
    GestionPersonas gPersonasMadrid = new GestionPersonas(new File(".\\archivoPersona.txt"));

    // Guardar Lista de List a Fichero
//    gPersonasMadrid.guardarListaFichero(lpm.rellenaListaPersonas());

    // Leer de Archivo a List
    List<Persona> personas = gPersonasMadrid.leerListaFichero(gPersonasMadrid.getRuta());
    for (Persona p : personas) {
      Console.escribeS(p.toString(), true);
    }

    // Crear Persona
//    gPersonasMadrid.crearPersona(new Persona("Nicole", "Bonifaz", 30, 156, 57));

    // Borrar Persona
//    gPersonasMadrid.borrarPersona("nicole");

    // Leer Persona
//    System.out.println(gPersonasMadrid.leerPersona("nicole"));

    // Actualizar Persona
//    gPersonasMadrid.actualizarPersona(gPersonasMadrid.leerPersona("carolina"));

  }
}