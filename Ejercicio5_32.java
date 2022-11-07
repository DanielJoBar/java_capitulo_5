import java.util.Scanner;
public class Ejercicio5_32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un entero: ");
        long n= sc.nextInt();
        long mod;
        long suma=0;
        String pares ="";
        long volteado=0;
        long aux = n;
        do{
            if(n<0){
                System.out.print("Usted ha introducido un numero no valido , introduzcalo de nuvo: ");
                n = sc.nextInt();
            }
        }
        while(n<0);
        while(aux>0){
        volteado=volteado*10+aux%10;
        aux/=10;
        }
        while(volteado>0){
            mod=volteado%10;
            if(mod%2==0){
            pares=pares+mod+" ";
            suma=mod+suma;
            }
            volteado/=10;
        }
        System.out.println("Los numeros pares son: "+pares);
        System.out.println("La suma de los pares es de : "+suma);
        sc.close();
    }
}
