import java.util.Scanner;
public class Ejercicio5_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba 10 números :");
        int n=sc.nextInt();
        int negativo=0;
        int positivo=0;
        int nulo=0;
        for(int cont=0;cont<=10;cont++){
            if(n<0){negativo++;}
            if(n>0){positivo++;}
            if(n==0){nulo++;}
            n=sc.nextInt();
        }
        System.out.print("  Números positivos:  "+positivo+"  ,Números negativos:  "+negativo+"  ,Numeros nulos:  "+nulo);
        sc.close();
    }
}
