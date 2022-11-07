import java.util.Scanner;
public class Ejercicio5_28 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    int n = sc.nextInt();
    int f1=1;
    int f2 = 1;
    int f3 = 1;
    for(int contF=1;contF<=n;contF++){
        f2=f3;
        f3=f1*f2;
        f1++;
    }
    System.out.print(f3);
    sc.close();
 }   
}
