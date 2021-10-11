package gestionFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilePermission;
import java.io.FileReader;
import java.security.AccessControlContext;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.Permission;
import java.util.Scanner;

public class ListaRuta {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Fichero no existe");
//      throw new NullPointerException();
    } else {
      String filename = args[0];
      File e = new File(filename);
      listaDirectorios(e);
    }

  }

  public static void listaDirectorios(File ruta) {
//    Permission permiso = new java.io.FilePermission("ruta", false);
//    Permission permiso = new java.io.FilePermission("ruta", false);
    File[] fichero = ruta.listFiles();
//    AccessController.checkPermission(permiso);
    try {
      if (ruta.exists()) {
        if (ruta.isDirectory()) {
          for (File f : fichero) {
//          System.out.println(f.getName() + ((f.isDirectory()) ? File.separator : "\t"));//sentencia ternaria del profe
            if (f.isDirectory()) {// hace falta una variable en directorio
              System.out.println(f.getName() + File.separator + "\t");
            }
            if (f.isFile()) {
              ListaRuta.listaDirectorios(f);
              System.out.println("\t" + f.getName());
            }
          }
        }
      }
    } catch (SecurityException se) {
      System.err.println("Security");
    }
  }

//    System.out.println("la ruta completa es: \n" + ruta.getAbsolutePath());
//    if (ruta.exists()) {
//      if (ruta.isDirectory()) {
//        File directorio[] = ruta.listFiles();
//        System.out.println("\nContenido del directorio:");
//        for (File f : directorio) {
//          if (f.isDirectory()) {
//            String acceso = ruta.canRead() == true || ruta.canWrite() ? "r" : "w";
//            System.out.println("- " + acceso + " " + f.getName() + " Es un archivo? " + ruta.isFile()
//                + " || Es un directorio? " + ruta.isDirectory());
//          } else {
//            String acceso = ruta.canRead() == true || ruta.canWrite() == true ? "rw" : "no puede leer ni escribir";
//            System.out.println("- " + acceso + " " + f.getName() + " Es un archivo? " + ruta.isDirectory()
//                + " || Es un directorio? " + ruta.isFile());
//          }
//        }
//      }
//    }

  ////////////// Profe/////////////////
//    if (ruta.exists()) {
//      if (ruta.isDirectory()) {
//        File directorio[] = ruta.listFiles();
//        for (File f : directorio) {
//          File fichero = f;
//          System.out.println(fichero.getName() + ((fichero.isDirectory()) ? File.separator : ""));
//        }
//      }
//    } else {
//      System.out.println("El fichero no existe");
//    }
  /////////////////////////////////////

}
