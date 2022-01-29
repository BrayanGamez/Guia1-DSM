import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
  public static void main(String[] args) 
  {
    Scanner teclado = new Scanner(System.in);
    String coordenada;
    int cantidad = 0;
    List<String> C1 = new ArrayList<String>();
    List<String> C2 = new ArrayList<String>();
    List<String> C3 = new ArrayList<String>();
    List<String> C4 = new ArrayList<String>();

    //Formato de entrada x,y (como string)
    System.out.println("Ingrese la cantidad de coordenas ");
    cantidad = teclado.nextInt();

//Conversion a numeros y logica
    for (int i = 0; i < cantidad; i++) 
    {
      System.out.println("Ingrese la coordenada N"+(i+1)+" :");
      coordenada = teclado.next();
      Pattern patron = Pattern.compile("(-?\\d+),(-?\\d+)");
      Matcher emparejador = patron.matcher(coordenada);
      
      emparejador.find();

      double x = Double.parseDouble(emparejador.group(1));
		  double y = Double.parseDouble(emparejador.group(2));

      System.out.println("x: "+x+", y: "+y);

      if(x>0)
      {
        if(y>0)
        {
          C1.add(coordenada);
        }
        else{
          C4.add(coordenada);
        }
      }
      else
      {
        if(y>0)
        {
          C2.add(coordenada);
        }
        else{
          C3.add(coordenada);
        }
      }
    }
    //salida de numeros en sus cuadrantes
    System.out.println("Numeros en el primer cuadrante: "+C1.toArray().length);
    System.out.println("Numeros en el Segundo cuadrante: "+C2.toArray().length);
    System.out.println("Numeros en el Tercer cuadrante: "+C3.toArray().length);
    System.out.println("Numeros en el Cuarto cuadrante: "+C4.toArray().length);
  }
}