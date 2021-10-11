package gestionFicheros.texto.practica1.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

import gestionFicheros.texto.practica1.view.Console;

public class GestionPersonas {

  private File ruta;

  public GestionPersonas(File ruta) {
    this.ruta = ruta;

  }

  public File getRuta() {
    return ruta;
  }

  public void setRuta(File ruta) {
    this.ruta = ruta;
  }

  public void guardarListaFichero(List<Persona> list) {
    FileWriter fichero = null;
    try {
      fichero = new FileWriter(getRuta());// PersistenciaPersonas.asignaArchivo(".\\archivoPersona.txt")
      for (Persona p : list) {
        fichero.write(p.getNombre() + ", " + p.getApellidos() + ", " + p.getEdad() + ", " + p.getAltura() + ", "
            + p.getPeso() + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {//
      if (fichero != null) {
        try {
          fichero.close();
        } catch (Exception e2) {
          Console.smsError("Fallo en fichero.close");
          Console.smsError(e2.getMessage());
        }
      }
    }
  }

  public List<Persona> leerListaFichero(File list) {
    FileReader fichero = null;
    BufferedReader buffer = null;
    List<Persona> pp = new ArrayList<>();
    Persona p = null;
    try {
      fichero = new FileReader(list);
      buffer = new BufferedReader(fichero);
      String linea;
      String[] contLinea;
      while ((linea = buffer.readLine()) != null) {
        contLinea = linea.split(", ");
        p = new Persona(contLinea[0], contLinea[1], Integer.parseInt(contLinea[2]), Integer.parseInt(contLinea[3]),
            Float.parseFloat(contLinea[4]));
        pp.add(p);
      }
    } catch (FileNotFoundException fnfe) {
      Console.escribeS("Fichero introducido no existe", true);
      fnfe.printStackTrace();
    } catch (IOException ioe) {
      Console.escribeS("Fichero introducido no existe", true);
      ioe.printStackTrace();
    } finally {//
      if (fichero != null) {
        try {
          fichero.close();
        } catch (Exception e2) {
          Console.smsError("Fallo en fichero.close");
          Console.smsError(e2.getMessage());
        }
      }
    }
    return pp;
  }

  public void crearPersona(Persona p) {
    List<Persona> pp = leerListaFichero(getRuta());
    pp.add(p);
    guardarListaFichero(pp);
  }

  public void borrarPersona(String nombre) {
    List<Persona> pp = leerListaFichero(getRuta());
    String e;
    for (int i = 0; i < pp.size(); i++) {
      e = pp.get(i).getNombre();
      if (e.equalsIgnoreCase(nombre)) {
        pp.remove(i);
      }
    }
    guardarListaFichero(pp);
  }

  public Persona leerPersona(String nombre) {
    List<Persona> pp = leerListaFichero(getRuta());
    Persona per = null;
    String e;
    int i = 0;
    for (Persona p : pp) {
      e = pp.get(i).getNombre();
      if (e.equalsIgnoreCase(nombre)) {
        per = new Persona(p.getNombre(), p.getApellidos(), p.getEdad(), p.getAltura(), p.getPeso());
      }
      i++;
    }
    return per;
  }

  public void actualizarPersona(Persona persona) {
    List<Persona> pp = leerListaFichero(getRuta());
    int i = 0;
    boolean out = true;
    for (Persona p : pp) {
      if (p.equals(persona) && out) {
        pp.set(i, Console.menuActualiza());
        out = false;
      }
      i++;
    }
    guardarListaFichero(pp);
  }
}