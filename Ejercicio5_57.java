import java.util.Scanner;
public class Ejercicio5_57 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        int aux=1;
        for(int i=1;i<=altura;i++){
            for(int k  = 1;k <= aux;k++){
                System.out.print(" ");
            }
            if(i==1){
            for(int j=1;j<=altura-i+1;j++){
                System.out.print("*");
            }
            }
            else{
                System.out.print("*");
                for(int k =1 ;k<=altura-i-1;k++){
                    System.out.print(" ");
                }
                if(i<altura){
                    System.out.print("*");
                }
            }
            System.out.println();
            aux++;
        }
        sc.close();
    }
}
