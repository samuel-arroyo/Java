import java.util.Scanner;

/**
 * Clace principal de la calculadora
 */

public class Name {

    publiic static void main(String[] args)
    {
        // Creacion del objeto Scaner
        scanner entrada = new Scanner(System.in);


        // Pedimos los datos de entrada al usuario
        System.out.print("Ingresa el primer numero:");
        int num1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero:");
        int num2 = entrada.nextInt();


        // Creamos un objeto de tipo calculadora
        calculadora calculadora = new calculadora();

        //Realizamos las operaciones correspondientes
        int sune = calculadora .suma(num1,num2);
        int resta = calculadora .resta(num1,num2);
        int multiplicacion = calculadora .multiplicacion(num1,num2);
        int divicion = calculadora .divicion(num1,num2);

        // Imprimimos los resultados
        System.out.println("El resultado de la suma es:"+suma);
        System.out.println("El resultado de la suma es:"+resta);
        System.out.println("El resultado de la suma es:"+suma);
        System.out.println("El resultado de la suma es:"+suma);









    }


}
