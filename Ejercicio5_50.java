/*Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura. */
import java.util.Scanner;
public class Ejercicio5_50 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del número(5 como mínimo): ");
        int altura = sc.nextInt();
        System.out.print("Introduzca los espacios entre números(1 como mínimo): ");
        int espacios = sc.nextInt();
        while(altura<5||espacios<1){
        System.out.println("Usted ha introducido algún dato erroneamente, por favor introduzcalos de nuevo: ");
            System.out.print("Introduzca la altura del número(5 como mínimo): ");
                altura = sc.nextInt();
            System.out.print("Introduzca los espacios entre números(1 como mínimo): ");
                espacios = sc.nextInt();
        }
        for(int fila=1;fila<=altura;fila++){
            if(fila==1||fila==3||fila==altura){
                System.out.print("*");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.print("*****");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.println("*****");
            }
            else if(fila==2){
                System.out.print("*");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.print("*    ");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.println("*    ");
            }
            if(fila>3&&fila<altura){
                System.out.print("*");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.print("    *");
                for(int espacio=1;espacio<=espacios;espacio++){
                    System.out.print(" ");
                }
                System.out.println("    *");
            }

        }
        sc.close();
    }
}
