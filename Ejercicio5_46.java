import java.util.Scanner;
public class Ejercicio5_46 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del rectángulo(minimo2): ");
        int altura = sc.nextInt();
        System.out.print("Introduzca la anchura del rectángulo(minimo2): ");
        int ancho = sc.nextInt();
        while(ancho<2||altura<2){
            System.out.println("Usted ha introducido un dato erroneo ,por favor introduzcalos de nuevo: ");
            System.out.print("Introduzca la altura del rectángulo: ");
             altura = sc.nextInt();
            System.out.print("Introduzca la anchura del rectángulo: ");
             ancho = sc.nextInt();
        }
        for(int contFila=1;contFila<=altura;contFila++){
            if(contFila==1||contFila==altura){
                for(int contAncho=1;contAncho<=ancho;contAncho++){
                System.out.print("* ");
                if(contAncho==ancho){
                    System.out.println();
                }
                }
            }
            if(contFila>1&&contFila<altura){
                System.out.print("*");
                for(int contAncho=0;contAncho<=2*(ancho-2);contAncho++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
        sc.close();
    }
}
