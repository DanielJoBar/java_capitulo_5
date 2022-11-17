import java.util.Scanner;
public class Ejercicio5_60 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de los calcetines: ");
    int altura = sc.nextInt();
    for(int fila=1;fila<=altura;fila++){
    if(fila<=altura-2){
        for(int i=1;i<=14;i++){
            if(i<=3||i>8&&i<12){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    else{
        for(int i=1;i<=14;i++){
            if(i<=6||i>8){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
    sc.close();
   } 
}
