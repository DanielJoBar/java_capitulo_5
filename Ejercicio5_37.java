/* Realiza un conversor del sistema decimal al sistema de “palotes”. */
import java.util.Scanner;
public class Ejercicio5_37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long n = sc.nextLong();
        long aux = n;
        long vuelta = 0;
        while(n<0){
            System.out.print("usted ha introducido un número no valido introduzcalo de nuevo: ");
            n = sc.nextLong();
        }
        System.out.print("El "+n+" en decimal es el ");
        while(aux>0){
            vuelta=vuelta*10+aux%10;
            aux/=10;
        }
        while(vuelta>0){
            aux=vuelta%10;
            vuelta/=10;
            System.out.print("-");
            for(int cont=1;cont<=aux;cont++){
                if(aux==0){
                    System.out.print("  ");
                }
                else{
                    System.out.print(" |");
                }
            }
        }
        System.out.print(" en el sistema de palotes");
        sc.close();
    }
}
