package calculadora;

import java.util.Scanner;

/**
 *
 * @author romarei
 */
public class main {
     public static void main(String[] args){
            System.out.println("seleccione la operación a realizar 1:suma 2:resta 3: multiplicar 4:dividir");
            Scanner teclado;
            teclado = new Scanner(System.in);
            int operacion=teclado.nextInt();
            int a,b;
            a = primer_operador(teclado);
            System.out.println("Introduce el valor del segundo operador");
            b=teclado.nextInt();
            calculadora calcu=new calculadora(a,b);
         final String escribir = "El resultado de la suma es ";
            
            switch (operacion){
                case 1 -> System.out.println(escribir+calcu.suma());
                case 2 -> System.out.println(escribir+calcu.resta());
                case 3 -> System.out.println("El resultado de la mujltiplicación es "+calcu.multiplicar());
                case 4 -> System.out.println(escribir+calcu.divide());
                default -> System.out.println("no ha elegido la operación correcta");  
            }
        }

    public static int primer_operador(Scanner teclado) {
        int a;
        System.out.println("introduce el valor del primer operador");
        a=teclado.nextInt();
        return a;
    }
}