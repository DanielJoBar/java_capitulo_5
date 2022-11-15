import java.util.Scanner;
public class Ejercicio5_41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero positivo(mayor que 0): ");
        long n = sc.nextLong();
        int contPar=0;
        int contImpar=0;
        long holder =0;
        long aux =n;
        while(n<=0){
            System.out.print("Usted ha introducido un número invalido intentelo de nuevo: ");
            n=sc.nextLong();
        }
        while(aux>0){
        holder=aux%10;
        if(holder%2==0){
            contPar++;
        }
        else{
            contImpar++;
        }
        aux/=10;
        }
        System.out.print("El "+n+" contiene "+contPar+" dígitos pares y "+contImpar+" dígitos impares.");
        sc.close();
    }
}
