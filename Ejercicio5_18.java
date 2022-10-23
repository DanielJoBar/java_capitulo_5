import java.util.Scanner;
public class Ejercicio5_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el primer número:   ");
        int n = sc.nextInt();
        System.out.print("Escriba el segundo número:   ");
        int n2= sc.nextInt();
        for(int cont=n+7;cont<n2;cont+=7){
        System.out.println(" "+cont);
        }

        sc.close();
    }
}
