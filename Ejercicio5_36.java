/* Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. */
import java.util.Scanner;
public class Ejercicio5_36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        long aux = n;
        long resultado=0;
        if(aux>0){
        while(aux>0){
            resultado=resultado*10+aux%10;
            aux/=10;
        }}
        else{
            do{
                resultado=-(resultado*10)+aux%10;
                aux/=10;
                aux=(long)aux;
            }while(aux!=0);
        }
        if(resultado==n){
            System.out.print("El número "+n+" sí es capicúo");
        }
        else{
            System.out.print("El número "+n+" no es capicúo");
        }
        sc.close();
    }
}
