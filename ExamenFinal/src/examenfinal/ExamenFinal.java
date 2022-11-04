/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner;
/**
 *
 * @author HOGAR
 */
public class ExamenFinal {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        double num1, num2;
         
        int opcion, opcionEjercicio1, opcionEjercicio2, opcionEjercicio3;
        
        do {
            System.out.println("-----Menú Principal-----");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2 ");
            System.out.println("3. Ejercicio 3 ");
            System.out.println("4. Salir");

            System.out.println("Escoja uno de los siguientes ejercicios");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese un valor");
                    num1 = sn.nextDouble();

                    System.out.println("Ingrese otro valor");
                    num2 = sn.nextDouble();

                    if (num1 > num2) {
                        System.out.println("El número mayor es: " + num1);
                    }
                    if (num2 > num1) {
                        System.out.println("El número mayor es: " + num2);
                    }
                    if (num2 == num1) {
                        System.out.println("Los números que ingreso son iguales");
                    }
                    break;

                case 2:
                    Scanner piramide = new Scanner(System.in);
                    System.out.println("Ingrese un número impar");
                    int n = piramide.nextInt();

                    if (!(n % 2 == 0)) {
                        for (int i = 0; i <= n; i++) {
                            for (int k = n - i; k > 0; k--) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < i; k++) {
                                System.out.print(" *");
                            }
                            System.out.println("");
                        }

                    } else {
                        System.out.println("Su número no es impar");
                    }
                    break;

                case 3:

                case 4:
                    System.out.println("Fin del menu");
                    break;

                default:
                    System.out.println("Las opciones son entre 1 y 4");
                    break;

            }
        } while (salir);

            
        
    }
}
