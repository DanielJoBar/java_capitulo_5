import java.util.Scanner;
public class Ejercicio5_17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.print("Ha entroducido un numero no valido intentelo de nuevo:  ");
            n= sc.nextInt();
        }
        for(int cont=n;cont<=n+100;cont++){
        System.out.println("   "+cont);
        }

        sc.close();
    }
}
