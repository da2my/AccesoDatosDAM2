package gestionFicheros;

public class PracticaExcepciones {

  public static void main(String[] args) {
    int a = 5, b = 0;

    try {
      System.out.println(a / b);
    } catch (Exception e) {
      System.err.println("No se puede dividir entre ceroo melon");
    }
  }
  
  //Finally se ejecuta si o si!! PASE LO QUE PASE CIERRO el archivo en Finally

}
