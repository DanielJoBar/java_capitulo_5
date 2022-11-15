import java.util.Scanner;
public class Ejercicio5_53 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura : ");
        int n = sc.nextInt();
        for(int fila =1;fila<=n;fila++){
            for(int contAsterisco=1;contAsterisco<=n+1-fila;contAsterisco++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
