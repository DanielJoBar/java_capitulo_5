import java.util.Scanner;
public class Ejercicio5_61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la V(un numero mayor o igual a 3): ");
        int altura =sc.nextInt();
        int aux=2;
        while(altura<3){
        System.out.println("Usted ha introducido un número incorrecto, por favor introdúzcalo de nuevo(un numero mayor o igual a 3): ");
        altura =sc.nextInt();
        }
        for(int fila=1;fila<=altura;fila++){
            if(fila>1){
                for(int espacios=1;espacios<=fila-1;espacios++)
                    System.out.print(" ");
                
            }
            System.out.print("***");
            for(int espacios=1;espacios<=2*altura-aux;espacios++)
            System.out.print(" ");
            aux+=2;
            System.out.println("***");
        }
        sc.close();
    }
}
