import java.util.*;

class Main 
{
  public static void main(String[] args) 
  {
    List<Double> mayorQue = new ArrayList<Double>();
    List<Double> menorQue = new ArrayList<Double>();
    double nota = 0;
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < 10; i++)
     {
       nota=0;
      System.out.println("Ingrese la nota "+(i+1)+"");
      nota = teclado.nextInt();
      if (nota>7) 
      {
       mayorQue.add(nota);
      }
      else
      {
        menorQue.add(nota);
      }
    }

    System.out.println("Mayores a 7: "+mayorQue);
    System.out.println("menores a 7: "+menorQue);

  }

}