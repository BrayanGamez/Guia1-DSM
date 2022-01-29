import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    int cantidadNumeros=0;
    int numero = 0;
    Scanner teclado = new Scanner(System.in);
    List<Integer> pares = new ArrayList<Integer>();
    List<Integer> impares = new ArrayList<Integer>();

    System.out.println("Ingrese la cantidad de numeros a ingresar");
    cantidadNumeros = teclado.nextInt();

    for (int i = 0; i < cantidadNumeros; i++)
     {
      System.out.println("ingrese el numero "+(i+1)+": ");
      numero = teclado.nextInt();
      if (numero%2==0) {
        pares.add(numero);
      }
      else
      {
        impares.add(numero);
      }
    }

    System.out.println("Pares: "+pares.toArray().length);
    System.out.println("Impares: "+impares.toArray().length);
  }
}