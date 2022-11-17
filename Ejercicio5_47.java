import java.util.Scanner;
public class Ejercicio5_47 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del 8(minimo 5 y ha de ser impar): ");
        int altura = sc.nextInt();
        int ancho = 6;
        while(altura<5||altura%2==0){
            System.out.println("Usted ha introducido un dato erroneo ,por favor introduzcalos de nuevo: ");
            System.out.print("Introduzca la altura del rectángulo: ");
             altura = sc.nextInt();
        }
        for(int contFila=1;contFila<=altura;contFila++){
            if(contFila==1||contFila==altura||contFila==altura/2+1){
                for(int contAncho=1;contAncho<=ancho;contAncho++){
                System.out.print("M ");
                if(contAncho==ancho){
                    System.out.println();
                }
                }
            }
            if(contFila>1&&(contFila<altura/2+1||contFila<altura-1)){
                System.out.print("M");
                for(int contAncho=0;contAncho<=8;contAncho++){
                    System.out.print(" ");
                }
                System.out.println("M");
            }
        sc.close();
    }
}
}