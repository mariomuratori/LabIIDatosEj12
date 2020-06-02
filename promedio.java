
package promedio;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Promedio 
{

public static void main(String[] args) throws FileNotFoundException 
{
    System.out.println("Colocar la direccion del archivo: ");
    Scanner keyboard = new Scanner(System.in);

    String filename = keyboard.next();
    Scanner reader = new Scanner (new File(filename));

    int length = reader.nextInt();

    double [] num = new double[length];
    double [] num2 = new double[length];

System.out.println("Numeros:");
double sum = 0; //nueva variable
for(int i = 0; i < length; i++)
{
    num[i] = reader.nextDouble();
    sum += num[i];
    System.out.println(num[i]);
}
sum /= (double) length; //dividir por n para obtener el promedio
System.out.print("Promedio : ");
System.out.println(sum);

    }
}