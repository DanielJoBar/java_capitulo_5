import java.util.Scanner;
public class Ejercicio5_33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la U: ");
        int altura= sc.nextInt();
        for(int Fila =1;Fila<=altura-1;Fila++){
            for(int asterisco=1;asterisco<=2;asterisco++){
                System.out.print("*");
                for(int espacio=1;espacio<=altura-2;espacio++){
                    System.out.print(" ");
                }
            }
            System.out.println();
        if(Fila==altura-1){
            System.out.print(" ");
            for(int contAsterisco=1;contAsterisco<=altura-2;contAsterisco++){
                System.out.print("*");
            }
            System.out.print(" ");
        }
        }
        sc.close();
    }
}
