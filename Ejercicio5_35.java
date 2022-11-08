/* Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. */
import java.util.Scanner;
public class Ejercicio5_35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la X: ");
        int altura = sc.nextInt();
        boolean oK1=true;
        int aux =1;
        int aux2 =(altura/2)-1;
        double aux3=(altura/2)-0.5;
        do{
        if(altura%2!=0&&altura>=3){
        oK1=true;
            do{
            for(int contX1=1;contX1<=(altura/2)-0.5;contX1++){
                oK1=true;
                for(int espacio =0;espacio<aux+1;espacio++){
                    System.out.print(" ");
                }
                for(int asterisco=aux;asterisco<aux+1;){
                    System.out.print("*");
                    for(int espacio2=1;espacio2<aux2*2;espacio2++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    asterisco++;
                
            }aux++;aux2--;
        }}
        while(aux<aux3);
        for(int espacioM=0;espacioM<=altura/2;){
            System.out.print(" ");
            espacioM++;
        }
        System.out.println("*");
        aux2=altura/2;
        aux=2;
        do{
            for(int contX1=1;contX1<=(altura/2)-0.5;contX1++){
                oK1=true;
                for(int espacio =0;espacio<aux2;espacio++){
                    System.out.print(" ");
                }
                for(int asterisco=1;asterisco<2;){
                    System.out.print("*");
                    for(int espacio2=1;espacio2<aux;espacio2++){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    asterisco++;
                
            }aux+=2;aux2--;//int aux =1; int aux2 =(altura/2)-1;
        }
    }
        while(aux<aux3);
        }
    else{
        oK1=false;
        System.out.print("Usted ha introducido una altura no válida pruebe de nuevo: ");
        altura=sc.nextInt();
}}
        while(!oK1);
        sc.close();
}}