import java.util.Scanner;
public class Ejercicio5_54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura : ");
        int n = sc.nextInt();
        for(int fila =1;fila<=n;fila++){
            if(fila==1){
            for(int contAsterisco=1;contAsterisco<=n+1-fila;contAsterisco++){
                System.out.print("*");
            }}
            if(fila>1){
                System.out.print("*");
                for(int espacios=1;espacios<n-fila;espacios++){
                    System.out.print(" ");
                }
                if(fila<n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
