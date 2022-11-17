import java.util.Scanner;
public class Ejercicio5_63 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide 1: ");
        int altura1 =sc.nextInt();
        System.out.print("Introduzca la altura de la pirámide 2: ");
        int altura2 = sc.nextInt();
        int alturaMayor=0;
        if(altura1>=altura2)
        alturaMayor =altura1;
        else
        alturaMayor=altura2; 
        for(int i =1 ; i<alturaMayor;i++){
            for(int espacios=1;espacios<alturaMayor;espacios++){
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
