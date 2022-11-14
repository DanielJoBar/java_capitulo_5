/* Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. */
import java.util.Scanner;
public class Ejercicio5_38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del reloj de arena(impar mayor que 3): ");
        int altura = sc.nextInt();
        while(altura<3||altura%2==0){
            System.out.print("Usted ha introducido un valor no valido, por favor, introduzcalo de nuevo(impar mayor que 3): ");
            altura = sc.nextInt();
        }
        for(int fila =1;fila<=altura;fila+=2){
            for(int espacio =1;espacio<=fila/2;espacio++){
            if(espacio==fila/2&&(int)fila/2<espacio){
            }
            else{
            System.out.print(" ");                
            }
            }
            for(int asterisco=0;asterisco<=altura-fila;asterisco+=1){
                    System.out.print("*");
            }
            System.out.println();   
        }
        
        for(int fila =3;fila<=altura;fila+=2){
            for(int espacio =altura-fila;espacio>1;espacio-=2){
                if(espacio==fila/2&&(int)fila/2<espacio){
                }
                else{
                System.out.print(" ");                
                }
            }
                for(int asterisco = 1;asterisco<=fila;asterisco++){
                    System.out.print("*");
                }
                System.out.println();
            
        }
        sc.close();
    }   
}
