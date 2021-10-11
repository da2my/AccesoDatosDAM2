package gestionFicheros.texto;

import java.io.*;

public class PracticaTextoBasico {

  public static void escribirTextoBasico() {
    FileWriter fichero = null;
    PrintWriter escritor = null;

    try {
      fichero = new FileWriter(".\\archivo.txt", true);// Append para que escriba seguidamente y no borre
      System.out.println("Voy a escribir un ficherooo");
      fichero.write("Linea escrita desde java\n");

      escritor = new PrintWriter(fichero);
      escritor.print("Tambien puedo escribir con la clase PrintWriter()\n");
      escritor.printf("%s %d", "Esta linea es escrita con printf", 34, 5);
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    } finally {//
      if (fichero != null) {
        try {
          fichero.close();
        } catch (Exception e2) {
          // TODO: handle exception
          System.err.println("Fallo en fichero.close");
          System.err.println(e2.getMessage());
        }
      }
    }
  }

  public static void leerTextoBasico() {
    File ruta = null;
    FileReader fichero = null;
    BufferedReader buffer = null;

    try {
      ruta = new File(".\\archivo.txt");
      fichero = new FileReader(ruta);
      buffer = new BufferedReader(fichero);
      String linea;

      while ((linea = buffer.readLine()) != null) {
        System.out.println(linea);
      }
    } catch (FileNotFoundException fnfe) {
      // TODO: handle exception
      System.out.println("Fichero introducido no existe");
      fnfe.printStackTrace();
    } catch (IOException ioe) {
      // TODO: handle exception
      System.out.println("Fichero introducido no existe");
      ioe.printStackTrace();
    } finally {//
      if (fichero != null) {
        try {
          fichero.close();
        } catch (Exception e2) {
          // TODO: handle exception
          System.err.println("Fallo en fichero.close");
          System.err.println(e2.getMessage());
        }
      }
    }
  }
}