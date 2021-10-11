package gestionFicheros.texto.practica1.model;

public class Persona {

  private String nombre;
  private String apellidos;
  private int edad;
  private int altura;
  private float peso;

  public Persona() {

  }

  public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.altura = altura;
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + altura;
    result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
    result = prime * result + edad;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + Float.floatToIntBits(peso);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Persona other = (Persona) obj;
    if (altura != other.altura)
      return false;
    if (apellidos == null) {
      if (other.apellidos != null)
        return false;
    } else if (!apellidos.equals(other.apellidos))
      return false;
    if (edad != other.edad)
      return false;
    if (nombre == null) {
      if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
      return false;
    if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
        + ", peso=" + peso + "]";
  }

}
