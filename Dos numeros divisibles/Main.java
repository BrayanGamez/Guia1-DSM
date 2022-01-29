import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
   int n1 = Teclado.nextInt();
   System.out.println("Ingrese el Segundo numero");
   int n2 = Teclado.nextInt();

   if(n1%n2==0)
   {
     System.out.println("Division de n1 / n2 = "+(n1/n2));
   }
   else{
   System.out.println("Los numeros no son divisibles entre si");
   }

  }
}