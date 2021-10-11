package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PracticaSerializacion {

  public static void testeoListaProductos() {
    List<Producto> miLista = new ArrayList<Producto>();
    miLista.add(new Producto("jamon", (float) 19.99));
    miLista.add(new Producto("queso", (float) 8.99));

    guardarListaProductos(miLista);

    List<Producto> otraLista = cargarListaProductos();

    for (Producto p : otraLista) {
      System.out.format("Producto %s cuesta %s euros\n", p.getNombre(), p.getPrecio());
    }

  }

  private static void guardarListaProductos(List<Producto> listaProductos) {

    ObjectOutputStream serializador = null;
    try {
      serializador = new ObjectOutputStream(new FileOutputStream("listaProductos.dat"));
      serializador.writeObject(listaProductos);
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      if (serializador != null)
        try {
          serializador.close();
        } catch (IOException ioe) {
          ioe.printStackTrace();
        }
    }
  }

  private static List<Producto> cargarListaProductos() {
    List<Producto> listaProductos = null;
    ObjectInputStream deserializador = null;
    try {
      deserializador = new ObjectInputStream(new FileInputStream("listaProductos.dat"));
      listaProductos = (ArrayList<Producto>) deserializador.readObject();
    } catch (FileNotFoundException fnfe) {
      fnfe.printStackTrace();
    } catch (ClassNotFoundException cnfe) {
      cnfe.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      if (deserializador != null)
        try {
          deserializador.close();
        } catch (IOException ioe) {
          ioe.printStackTrace();
        }
    }
    return listaProductos;
  }

}
