import java.util.Scanner;
public class Ejercicio5_11 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el número que desee:  ");
    long n = sc.nextLong();
    for(long cont=n ; cont<n+5; cont++){
    System.out.printf("%3d  %3d  %3d\n",n,n*n,n*n*n);
    }
    sc.close();
}}
