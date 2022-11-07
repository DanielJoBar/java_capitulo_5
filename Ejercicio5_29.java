import java.util.Scanner;
public class Ejercicio5_29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un entero(positivo): ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca otro número entero (el cual no puede ser divisor de los numeros que apareceran): ");
        int n2 = sc.nextInt();
        if(n1<=0&&n2<=0){
            do{
            System.out.print("Usted ha introducido un valor no válido pruebe de nuevo: ");
            System.out.print("Introduzca un entero(positivo) : ");
            n1 = sc.nextInt();
            System.out.print("Introduzca otro número entero (el cual no puede ser divisor de los numeros que apareceran): ");
            n2 = sc.nextInt();
        }
            while(n1<=0&&n2<=0);
        }    
        for(int cont = 1;cont<n1;cont++){
            if(cont%n2!=0){
                System.out.print(cont+",");
            }
            }
        sc.close();
    }
}
