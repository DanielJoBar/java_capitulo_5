import java.util.Scanner;
public class Ejercicio5_49 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca tantos números como desee (para terminar introduzca un número primo): ");
        long n = sc.nextLong();
        double contNum=1;
        boolean primo = true;
        boolean Ok =false;
        long maximo =n;
        double Media =0;
        long suma =0; 
        long minimo =n;
        while(!Ok){
        for(long contPrimo=2;contPrimo<n;contPrimo++){
            primo=true;
            if(n%contPrimo==0){
                primo=false;
                contPrimo=n-1;
            }
        }
        if(!primo){
         if(n>maximo){
            maximo=n;
         }
         if(n<minimo){
            minimo=n;
         }
        }
        else{
            contNum--;
            Media =suma/contNum;
            System.out.println("Ha introducido "+(int)contNum+" números no primos");
            System.out.println("Máximo: "+maximo);
            System.out.println("Mínimo: "+minimo);
            System.out.println("Media: "+Media);
            Ok=true;
        }
        contNum++;
        suma=suma+n;
        n = sc.nextLong();
    }
        sc.close();
    }
}
