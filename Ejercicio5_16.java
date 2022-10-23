import java.util.Scanner;
public class Ejercicio5_16{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int div=2;
        int n=sc.nextInt();
        int contPrim=0;
        for (int cont=1; cont<n;cont++){
            if(n%div!=0){
                contPrim++;
            }
            div++;
        }
        if(contPrim==n-2){
            System.out.print("Es primo");
        }
        if(contPrim<n-2||n==1){
            System.out.print("No es primo");
        }
        sc.close();
    }    
}