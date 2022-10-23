import java.util.Scanner;
public class Ejercicio5_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long num;
       long suma=0;
        int media=0;
        double sumaMedia;
        System.out.println("Introduzca tantos numeros como quiera hasta que ponga un numero menor a 0:");
        do{
            num=sc.nextLong();
            suma=suma+num;
            if(num>=0){
            media++;}
        }
        while(num>=0);
        sumaMedia=suma/(media-1);
        System.out.printf("La media de los numeros es %.3f:  ",sumaMedia);
        sc.close();
    }
    }
