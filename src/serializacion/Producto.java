package serializacion;

import java.io.Serializable;

// https://stackoverflow.com/questions/285793/what-is-a-serialversionuid-and-why-should-i-use-it
public class Producto implements Serializable {

  private static final long serialVersionUID = 1L;

  private String nombre;
  private float precio;

  public Producto(String nombre, float precio) {
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

}
