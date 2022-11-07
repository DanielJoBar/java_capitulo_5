import java.util.Scanner;
public class Ejercicio5_24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la altura de la pirámide: ");
        int altura = sc.nextInt();
        for(int i=1;i<=altura;i++){
        //Pintar los espacios en blanco
        for(int j=1;j<=altura-i;j++)
        System.out.print("");
        for(int j=1;j<i;j++)
            System.out.print(j);
        for(int j=i;j>=1;j--)
        System.out.print(j);
        System.out.println();
        }
    sc.close();
    }
}
